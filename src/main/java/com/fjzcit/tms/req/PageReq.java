package com.fjzcit.tms.req;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
@ToString
public class PageReq {
    // 当前页
    @NotNull(message = "【页码】不能为空！")
    private Integer current;

    // 每页条数
    @NotNull(message = "【每页条数】不能为空！")
    @Max(value = 100, message = "【每页条数】不能超过100")
    private Integer pageSize;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PageReq{");
        sb.append("current=").append(current);
        sb.append(", pageSize=").append(pageSize);
        sb.append("}");
        return sb.toString();

        // return "PageReq{" +
        //         "current=" + current +
        //         ", pageSize=" + pageSize +
        //         '}';
    }
}
