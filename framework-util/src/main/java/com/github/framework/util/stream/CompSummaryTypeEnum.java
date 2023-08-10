package com.github.framework.util.stream;

import lombok.Getter;

/**
 * @Description 指标计算汇总类型枚举
 * @Author lh
 * @Date 2023/1/31 14:36
 */
@Getter
public enum CompSummaryTypeEnum {
    FIRST_QUARTER("0", "第一季度"),
    SECOND_QUARTER("1", "第二季度"),
    THIRD_QUARTER("2", "第三季度"),
    FOURTH_QUARTER("3", "第四季度"),

    FIRST_QUARTER_START("4", "第一季度季初"),
    SECOND_QUARTER_START("5", "第二季度季初"),
    THIRD_QUARTER_START("6", "第三季度季初"),
    FOURTH_QUARTER_START("7", "第四季度季初"),


    FIRST_QUARTER_END("8", "第一季度季末"),
    SECOND_QUARTER_END("9", "第二季度季末"),
    THIRD_QUARTER_END("10", "第三季度季末"),
    FOURTH_QUARTER_END("11", "第四季度季末"),

    AS_FIRST_QUARTER_END("12", "截止第一季度"),
    AS_SECOND_QUARTER_END("13", "截止第二季度"),
    AS_THIRD_QUARTER_END("14", "截止第三季度"),

    THIS_MONTH("15", "本月"),
    THIS_QUARTER("16", "本季"),
    THIS_YEAR("17", "本年"),

    AS_MONTH("18", "截止本月"),
    AS_QUARTER("19", "截止本季"),

    THIS_MONTH_START("20", "当月初"),
    THIS_QUARTER_START("21", "当季初"),
    THIS_YEAR_START("22", "当年初"),

    THIS_MONTH_END("23", "当月末"),
    THIS_QUARTER_END("24", "当季末"),
    THIS_YEAR_END("25", "当年末");

    String value;
    String name;

    CompSummaryTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }
}
