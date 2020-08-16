package com.jinshuo.mall.core.model;

import com.jinshuo.mall.core.idgen.CommonSelfIdGenerator;
import lombok.*;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 * @Classname IdentifiedEntity
 * @Description TODO
 * @Date 2019/7/9 14:17
 * @Created by dyh
 */
@Data
@Getter
@Setter(AccessLevel.PUBLIC)
@Accessors(chain = true)
@ToString
@EqualsAndHashCode
public abstract class IdentifiedEntity extends CoreBaseEntity {


    /**
     * 备注
     **/
    public String remarks;
    /***创建时间**/
    public Date createDate;
    /**
     * 更新时间
     **/
    public Date updateDate;
    /**
     * 状态 0正常 1删除
     **/
    public Integer status;
    /**
     * 版本
     **/
    public Integer version;

    public Long createBy;

    public Long updateBy;


    public IdentifiedEntity() {
        super();
        this.status = 0;
    }

    /**
     * 更新之前需要手动调用
     */
    @Override
    public void preUpdate() {
        this.updateDate = new Date();
    }

    /**
     * 插入之前执行 需要手动调用
     */
    @Override
    public void preInsert() {
        if (StringUtils.isBlank(getRemarks())) {
            setRemarks("--");
        }
        this.setId(CommonSelfIdGenerator.generateId());
        this.createDate = new Date();
        this.updateDate = new Date();
        this.status = 0;
        this.version = 1;
    }
}


