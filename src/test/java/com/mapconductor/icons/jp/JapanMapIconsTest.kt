package com.mapconductor.icons.jp

import org.junit.Assert.assertEquals
import org.junit.Test

class JapanMapIconsTest {
    @Test
    fun identifiersAreRegionQualified() {
        assertEquals(listOf("jp.post_office", "jp.police_box", "jp.shrine"), listOf(
            JapanMapIcons.postOffice.id,
            JapanMapIcons.policeBox.id,
            JapanMapIcons.shrine.id,
        ))
    }
}
