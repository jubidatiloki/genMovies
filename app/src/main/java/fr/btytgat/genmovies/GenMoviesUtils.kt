package fr.btytgat.genmovies

import android.util.Log

class GenMoviesUtils {

    companion object {
        val DEFAULT_OUTPUT_FILE_PATH_ONLY_AUDIO = ""
        val DEFAULT_OUTPUT_FILE_PATH_ONLY_VIDEO = ""

        val TAG = "[GenMoviesUtils]";



        private fun getArgsSettings(setting: Setting): List<String>{
            val argsSetting = ArrayList<String>()

            with(argsSetting){
                add("-vcodec")
                add(setting.videoCodec.value)
                add("-acodec")
                add(setting.audioCodec.value)
                add("-r")
                add(setting.framerate.value)
                add("-s")
                add(setting.resolution.value)
                add("-preset")
                add("ultrafast")
                add("-y")

            }

            return argsSetting;
        }

        /**
         * returns only the audio track from a video
         */
        fun getOnlyAudioFromSingleVideoPart(videoPath: String): List<String> {
            return getOnlyAudioFromSingleVideoPart(videoPath, Setting())
        }

        fun getOnlyAudioFromSingleVideoPart(videoPath: String, setting: Setting): List<String> {
            val args = ArrayList<String>()

            with(args){
                add("-i")
                add(videoPath)
                add("-vn")
                add("-c:a")
                add("copy")
                addAll(getArgsSettings(setting))
                add(DEFAULT_OUTPUT_FILE_PATH_ONLY_AUDIO)
            }

            for(arg in args){
                Log.i(TAG, "getOnlyAudioFromSingleVideoPart$arg")
            }
            return args
        }



        /**
         * returns only the video track from a video
         *  (it mute the video)
         */
        fun getOnlyVideoFromSingleVideoPart(videoPath: String): List<String> {
            return getOnlyVideoFromSingleVideoPart(videoPath, Setting())
        }


        fun getOnlyVideoFromSingleVideoPart(videoPath: String, setting: Setting): List<String> {
            val args = ArrayList<String>()

            with(args){
                add("-i")
                add(videoPath)
                add("-an")
                add("-c:v")
                add("copy")
                addAll(getArgsSettings(setting))
                add(DEFAULT_OUTPUT_FILE_PATH_ONLY_VIDEO)
            }

            for(arg in args){
                Log.i(TAG, "getOnlyVideoFromSingleVideoPart$arg")
            }

            return args
        }

    }

}