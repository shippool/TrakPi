package org.opentripplanner.trakpi.model


open class Entity(
    /** Id used by the data store and automatically set by data store. */
    var _id : String?
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Entity

        return _id == other._id
    }

    override fun hashCode(): Int {
        toString()
        return _id?.hashCode() ?: 0
    }
}

open class NamedEntity(var _id : String?, val name : String) : Comparable<NamedClass> {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as NamedEntity

        return name == other.name
    }
    override fun hashCode(): Int = name.hashCode()
    override fun compareTo(other: NamedClass): Int = name.compareTo(other.name)
    override fun toString(): String = name
}

open class NamedClass(val name : String) : Comparable<NamedClass> {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as NamedClass

        return name == other.name
    }
    override fun hashCode(): Int = name.hashCode()
    override fun compareTo(other: NamedClass): Int = name.compareTo(other.name)
    override fun toString(): String = name
}

class MigrationCollection (
        id : String? = null,
        val names: MutableList<String> = mutableListOf()
) : Entity(id)

