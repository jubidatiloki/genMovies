package fr.btytgat.genmovies.utils

import android.util.Size

enum class VideoResolution (val label: String, val size: Size, val value: String) {
    LANDSCAPE_360("Faible résolution - 360p", Size(640, 360), "640:360"),
    LANDSCAPE_720("Moyenne résolution - 720p", Size(1280, 720), "1280:720"),
    LANDSCAPE_1080("Haute résolution - 1080p", Size(1920, 1080), "1920:1080")
}