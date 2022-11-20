package com.andihasan7.mynoteapp2.database

@Entity
@Parcelize
data class Note(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,
 
    @ColumnInfo(name = "title")
    var title: String? = null,
 
    @ColumnInfo(name = "description")
    var description: String? = null,
 
    @ColumnInfo(name = "date")
    var date: String? = null
) : Parcelable