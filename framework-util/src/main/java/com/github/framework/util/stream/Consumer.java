package com.github.framework.util.stream;

/**
 * @author linbeihua
 * @date 2022/5/5 21:52
 **/
@FunctionalInterface
public interface Consumer<T> {

    /**
     * Performs this operation on the given argument.
     *
     * @param t1 the input argument
     * @param t2 the input argument
     */
    void accept(T t1, T t2);
}
