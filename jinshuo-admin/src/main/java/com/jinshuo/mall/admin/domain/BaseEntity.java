package com.jinshuo.mall.admin.domain;

import com.jinshuo.mall.admin.infra.util.MemberUtil;
import com.jinshuo.mall.core.idgen.CommonSelfIdGenerator;
import com.jinshuo.mall.core.model.IdentifiedEntity;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 * Created by Administrator on 2020/7/15.
 */
@Data
public class BaseEntity extends IdentifiedEntity {

    @Override
    public void preInsert() {
        if (StringUtils.isBlank(getRemarks())) {
            setRemarks("--");
        }
        this.setId(CommonSelfIdGenerator.generateId());
        this.createDate = new Date();
        this.updateDate = new Date();
        try {
            this.createBy = MemberUtil.getJwtBaseUser().getId();
            this.updateBy = MemberUtil.getJwtBaseUser().getId();
        } catch (Exception e) {
        }
        this.status = 0;
        this.version = 1;
    }

    @Override
    public void preUpdate() {
        this.updateDate = new Date();
        try {
            this.updateBy = MemberUtil.getJwtBaseUser().getId();
        } catch (Exception e) {
        }
    }
}

