/*
 * Copyright 2018 Priyank Vasa
 *
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.priyankvasa.android.cameraviewex

import android.annotation.TargetApi
import android.support.annotation.IntDef

object Modes {

    const val LANDSCAPE_90 = 90
    const val LANDSCAPE_270 = 270

    @IntDef(CameraMode.SINGLE_CAPTURE
            /*, CameraMode.BURST_CAPTURE*/,
            CameraMode.CONTINUOUS_FRAME
            /*, CameraMode.VIDEO*/)
    @Retention(AnnotationRetention.SOURCE)
    @Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY, AnnotationTarget.PROPERTY_GETTER)
    annotation class CameraMode {
        companion object {
            /** Output format is according to [CameraView.outputFormat] */
            const val SINGLE_CAPTURE = 0
            //const val BURST_CAPTURE = 1
            /** Output format is always [android.graphics.ImageFormat.YUV_420_888] */
            const val CONTINUOUS_FRAME = 2
            //const val VIDEO = 3
        }
    }

    /** Direction the camera faces relative to device screen. */
    @IntDef(OutputFormat.JPEG, OutputFormat.YUV_420_888, OutputFormat.RGBA_8888)
    @Retention(AnnotationRetention.SOURCE)
    @Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY, AnnotationTarget.PROPERTY_GETTER)
    annotation class OutputFormat {
        companion object {
            const val JPEG = 0
            const val YUV_420_888 = 1
            const val RGBA_8888 = 2
        }
    }

    /** Direction the camera faces relative to device screen. */
    @IntDef(Facing.FACING_BACK, Facing.FACING_FRONT)
    @Retention(AnnotationRetention.SOURCE)
    @Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY, AnnotationTarget.PROPERTY_GETTER)
    annotation class Facing {
        companion object {
            const val FACING_BACK = 0
            const val FACING_FRONT = 1
        }
    }

    /** The mode for the camera device's flash control */
    @IntDef(Flash.FLASH_OFF,
            Flash.FLASH_ON,
            Flash.FLASH_TORCH,
            Flash.FLASH_AUTO,
            Flash.FLASH_RED_EYE)
    @Retention(AnnotationRetention.SOURCE)
    @Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY, AnnotationTarget.PROPERTY_GETTER)
    annotation class Flash {
        companion object {
            const val FLASH_OFF = 0
            const val FLASH_ON = 1
            const val FLASH_TORCH = 2
            const val FLASH_AUTO = 3
            const val FLASH_RED_EYE = 4
        }
    }

    /** The mode for the camera device's noise reduction control */
    @IntDef(NoiseReduction.NOISE_REDUCTION_OFF,
            NoiseReduction.NOISE_REDUCTION_FAST,
            NoiseReduction.NOISE_REDUCTION_HIGH_QUALITY,
            NoiseReduction.NOISE_REDUCTION_MINIMAL,
            NoiseReduction.NOISE_REDUCTION_ZERO_SHUTTER_LAG)
    @Retention(AnnotationRetention.SOURCE)
    @Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY, AnnotationTarget.PROPERTY_GETTER)
    annotation class NoiseReduction {
        companion object {
            const val NOISE_REDUCTION_OFF = 0
            const val NOISE_REDUCTION_FAST = 1
            const val NOISE_REDUCTION_HIGH_QUALITY = 2
            @TargetApi(23)
            const val NOISE_REDUCTION_MINIMAL = 3
            @TargetApi(23)
            const val NOISE_REDUCTION_ZERO_SHUTTER_LAG = 4
        }
    }

    /** The mode for the camera device's auto white balance control */
    @IntDef(AutoWhiteBalance.AWB_OFF,
            AutoWhiteBalance.AWB_AUTO,
            AutoWhiteBalance.AWB_INCANDESCENT,
            AutoWhiteBalance.AWB_FLUORESCENT,
            AutoWhiteBalance.AWB_WARM_FLUORESCENT,
            AutoWhiteBalance.AWB_DAYLIGHT,
            AutoWhiteBalance.AWB_CLOUDY_DAYLIGHT,
            AutoWhiteBalance.AWB_TWILIGHT,
            AutoWhiteBalance.AWB_SHADE)
    @Retention(AnnotationRetention.SOURCE)
    @Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY, AnnotationTarget.PROPERTY_GETTER)
    annotation class AutoWhiteBalance {
        companion object {
            const val AWB_OFF = 0
            const val AWB_AUTO = 1
            const val AWB_INCANDESCENT = 2
            const val AWB_FLUORESCENT = 3
            const val AWB_WARM_FLUORESCENT = 4
            const val AWB_DAYLIGHT = 5
            const val AWB_CLOUDY_DAYLIGHT = 6
            const val AWB_TWILIGHT = 7
            const val AWB_SHADE = 8
        }
    }

    /** Shutter time in milliseconds */
    @IntDef(Shutter.SHUTTER_OFF,
            Shutter.SHUTTER_SHORT,
            Shutter.SHUTTER_LONG)
    @Retention(AnnotationRetention.SOURCE)
    @Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY, AnnotationTarget.PROPERTY_GETTER)
    annotation class Shutter {
        companion object {
            const val SHUTTER_OFF = 0 // ms
            const val SHUTTER_SHORT = 200 // ms
            const val SHUTTER_LONG = 400 // ms
        }
    }

    const val DEFAULT_ADJUST_VIEW_BOUNDS = true
    val DEFAULT_ASPECT_RATIO = AspectRatio.of(4, 3)
    const val DEFAULT_CAMERA_MODE = CameraMode.SINGLE_CAPTURE
    const val DEFAULT_OUTPUT_FORMAT = OutputFormat.JPEG
    const val DEFAULT_FACING = Facing.FACING_BACK
    const val DEFAULT_AUTO_FOCUS = false
    internal const val DEFAULT_TOUCH_TO_FOCUS = false
    const val DEFAULT_OPTICAL_STABILIZATION = false
    const val DEFAULT_FLASH = Flash.FLASH_OFF
    const val DEFAULT_NOISE_REDUCTION = NoiseReduction.NOISE_REDUCTION_OFF
    const val DEFAULT_SHUTTER = Shutter.SHUTTER_OFF
    const val DEFAULT_AWB = AutoWhiteBalance.AWB_OFF
    const val DEFAULT_ZSL = false
}