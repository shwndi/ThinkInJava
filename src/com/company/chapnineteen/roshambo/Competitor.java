package com.company.chapnineteen.roshambo;

/**
 * @author czy
 * @date 2021/3/18
 */
public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}
