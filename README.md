# MapConductor Icons for Japan — Android

Japan-specific map glyphs for MapConductor Android. This pack is selected explicitly; it never changes because of the device locale.

## Installation

The first registry release is in preparation. Its Gradle coordinate will be:

```kotlin
implementation("com.mapconductor:icons-jp:0.1.0")
```

For source development, clone `android-icons` and this repository beside each other, publish the common module to Maven Local with the Android SDK Gradle wrapper, and build this module:

```sh
./gradlew :android-icons:publishToMavenLocal
./gradlew -p android-icons-jp build
```

## Quick start

```kotlin
import androidx.compose.ui.graphics.Color
import com.mapconductor.icons.PinGlyphIcon
import com.mapconductor.icons.jp.JapanMapIcons

val postOfficeMarker = PinGlyphIcon(
    glyph = JapanMapIcons.postOffice,
    fillColor = Color.Red,
    glyphColor = Color.White,
)
```

Use `JapanMapIcons.policeBox` and `JapanMapIcons.shrine` the same way. Glyph IDs and shapes match the iOS and React packages.

<!-- BEGIN GENERATED ICON CATALOG -->
## Included glyphs

Glyph IDs are stable across Android, iOS, and React.

| Preview | API | Stable ID | Description |
|---|---|---|---|
| <img src="docs/icons/post_office.svg" width="40" height="40" alt="Japanese post office map symbol"> | `JapanMapIcons.postOffice` | `jp.post_office` | Japanese post office map symbol |
| <img src="docs/icons/police_box.svg" width="40" height="40" alt="Japanese koban, shown as crossed police batons"> | `JapanMapIcons.policeBox` | `jp.police_box` | Japanese koban, shown as crossed police batons |
| <img src="docs/icons/shrine.svg" width="40" height="40" alt="Shinto shrine"> | `JapanMapIcons.shrine` | `jp.shrine` | Shinto shrine |
<!-- END GENERATED ICON CATALOG -->
