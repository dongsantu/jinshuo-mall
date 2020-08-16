package com.jinshuo.mall.core.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.io.Serializable;

/**
 * @Classname CoreBaseEntity
 * @Description TODO
 * @Date 2019/7/9 18:50
 * @Created by dyh
 */
@Data
public abstract class CoreBaseEntity extends AssertionConcern implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实体编号（唯一标识）
     **/
    @JsonSerialize(using = ToStringSerializer.class)
    public Long id;

    /**
     * 是否是新记录（默认：false），调用setIsNewRecord()设置新记录，使用自定义ID。
     * 设置为true后强制执行插入语句，ID不会自动生成，需从手动传入。
     */
    protected boolean isNewRecord = true;

    public CoreBaseEntity() {

    }

    public CoreBaseEntity(long id) {
        this();
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * 插入之前执行方法，子类实现
     */
    public abstract void preInsert();

    /**
     * 更新之前执行方法，子类实现
     */
    public abstract void preUpdate();

}
