package fr.btytgat.genmovies

import fr.btytgat.genmovies.utils.AudioCodec
import fr.btytgat.genmovies.utils.VideoCodec
import fr.btytgat.genmovies.utils.VideoFramerate
import fr.btytgat.genmovies.utils.VideoResolution

data class Setting(
    val videoCodec: VideoCodec = DEFAULT_VIDEO_CODEC,
    val audioCodec: AudioCodec = DEFAULT_AUDIO_CODEC,
    val framerate: VideoFramerate = DEFAULT_FRAMERATE,
    val resolution: VideoResolution = DEFAULT_RESOLUTION,
){

    companion object {
        val DEFAULT_VIDEO_CODEC = VideoCodec.H264
        val DEFAULT_AUDIO_CODEC = AudioCodec.AAC
        val DEFAULT_FRAMERATE = VideoFramerate.FRAMERATE_30
        val DEFAULT_RESOLUTION = VideoResolution.LANDSCAPE_1080

    }
}