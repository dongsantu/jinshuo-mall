package com.jinshuo.mall.admin.application.dto.assermbler;

import com.jinshuo.mall.admin.application.dto.vo.gds.GdsSpuFrontVo;
import com.jinshuo.mall.admin.domain.gds.GdsSpu;
import org.springframework.beans.BeanUtils;

/**
 * Created by Administrator on 2020/8/16.
 */
public class GdsSpuAssermbler {

    /**
     * @param target
     * @return
     */
    public static GdsSpuFrontVo assembleBrandDto(GdsSpu target) {
        if (target == null) {
            return null;
        }
        GdsSpuFrontVo dto = new GdsSpuFrontVo();
        BeanUtils.copyProperties(target, dto);
        return dto;
    }
}
