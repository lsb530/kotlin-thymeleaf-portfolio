package com.boki.kotlinthymeleafportfolio.admin.data

data class TableDTO(
    val name: String,
    val columns: List<String>,
    val records: List<List<String>>
) {

}
