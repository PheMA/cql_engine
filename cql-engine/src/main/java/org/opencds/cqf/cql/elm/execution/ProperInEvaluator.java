package org.opencds.cqf.cql.elm.execution;

/*
    There are two overloads of this operator:
        T, List : The type of T must be the same as the element type of the list.
        T, Interval : The type of T must be the same as the point type of the interval.

    For the T, List overload, this operator returns if the given element is in the given list,
        and it is not the only element in the list, using equivalence semantics.
        If the list-valued argument is null, it should be treated as an empty list.

    For the T, Interval overload, this operator returns true if the given point is greater than
        the starting point, and less than the ending point of the interval, as determined by the Start and End operators.
        If precision is specified and the point type is a date/time type, comparisons used in the operation are performed
            at the specified precision.
*/

import org.opencds.cqf.cql.execution.Context;

public class ProperInEvaluator extends org.cqframework.cql.elm.execution.ProperIn {

    public static Boolean properIn(Object left, Object right) {
        return ProperContainsEvaluator.properContains(right, left);
    }

    public static Boolean properIn(Object left, Object right, String precision) {
        return ProperContainsEvaluator.properContains(right, left, precision);
    }

    @Override
    protected Object internalEvaluate(Context context) {
        Object left = getOperand().get(0).evaluate(context);
        Object right = getOperand().get(1).evaluate(context);
        String precision = getPrecision() != null ? getPrecision().value() : null;

        if (precision != null) {
            return properIn(left, right, precision);
        }

        return properIn(left, right);
    }
}
