package com.github.framework.util.stream;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 2
 * @Author lh
 * @Date 2023/1/31 15:40
 */
public class IFSummaryFunction {

    private Map<String, SummaryFunction> map;

    /**
     *  通过map类型来保存对应的条件key和方法
     *
     * @param map a map
     */
    public IFSummaryFunction(Map<String, SummaryFunction> map) {
        this.map = map;
        map.put(CompSummaryTypeEnum.FIRST_QUARTER.getValue(), IFSummaryFunction::a);
        map.put(CompSummaryTypeEnum.SECOND_QUARTER.getValue(), (date, indFre) -> {
            System.out.println(indFre + date);
        });
    }

    public static void a(String a, String b) {
        System.out.println(a + b);
    }

    /**
     * 添加条件
     *
     * @param key      需要验证的条件（key）
     * @param function 要执行的方法
     * @return this.
     */
    public IFSummaryFunction add(String key, SummaryFunction function) {
        this.map.put(key, function);
        return this;
    }

    /**
     * 确定key是否存在，如果存在，则执行相应的方法。
     *
     * @param key the key need to verify
     */
    public void doIf(String key, String arg1, String arg2) {
        if (this.map.containsKey(key)) {
            map.get(key).summaryCalculate(arg1, arg2);
        }
    }

    /**
     * 确定key是否存在，如果存在，则执行相应的方法。
     * 否则将执行默认方法
     *
     * @param key             需要验证的条件（key）
     * @param defaultFunction 要执行的方法
     */
    public void doIfWithDefault(String key, String arg1, String arg2, SummaryFunction defaultFunction) {
        if (this.map.containsKey(key)) {
            map.get(key).summaryCalculate(arg1, arg2);
        } else {
            defaultFunction.summaryCalculate(arg1, arg2);
        }
    }

    public static void main(String[] args) {
        IFSummaryFunction ifSummaryFunction = new IFSummaryFunction(new HashMap<>(5));
        ifSummaryFunction.doIf(CompSummaryTypeEnum.FIRST_QUARTER.getValue(), "1", "2");
        ifSummaryFunction.doIf(CompSummaryTypeEnum.SECOND_QUARTER.getValue(), "1", "2");
    }
}
