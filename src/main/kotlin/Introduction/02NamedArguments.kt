package com.salausmart.Introduction

fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", postfix = "]")