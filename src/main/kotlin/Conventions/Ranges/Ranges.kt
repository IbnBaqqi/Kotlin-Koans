/**
 * Ranges
 * Using ranges implement a function that checks whether the date is in the range between the first date and the last date (inclusive).
 * You can build a range of any comparable elements. In Kotlin in checks are translated to the corresponding contains calls and .. to rangeTo calls:
 */

package com.salausmart.Conventions.Ranges

import com.salausmart.Conventions.MyDate

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first.rangeTo(last)
}