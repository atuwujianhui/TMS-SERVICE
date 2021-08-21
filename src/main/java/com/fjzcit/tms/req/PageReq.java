package com.fjzcit.tms.req;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PageReq {
    // 当前页
    private Integer current;

    // 每页条数
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
