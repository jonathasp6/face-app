# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

set(LIB_DIR ${CMAKE_SOURCE_DIR}/../../../cppLibs)

#Compile dlib inside the android project to use openblas optimize
add_subdirectory(${LIB_DIR}/dlib dlib_build)
set(OPENBLAS_DIR ${LIB_DIR}/openblas)
set(OPENCV_DIR ${CMAKE_SOURCE_DIR}/../../../opencv411)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

add_library( # Sets the name of the library.
        face

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        facetoolbridge.cpp
        Converter.cpp
        dlibtool/DlibLandmarkTool.cpp
        dlibtool/DlibFaceDescriptorTool.cpp
        dlibtool/DlibFaceDetector.cpp
        opencvtool/OpencvFaceDetector.cpp
        opencvtool/OpenvcConverter.cpp
        opencvtool/OpencvLandmarkTool.cpp
        )

#Add openblas
add_library(openblas
        SHARED
        IMPORTED )

set_target_properties(
        # Specifies the target library.
        openblas

        # Specifies the parameter you want to define.
        PROPERTIES IMPORTED_LOCATION

        # Provides the path to the library you want to import.
        ${OPENBLAS_DIR}/${ANDROID_ABI}/lib/libopenblas.a)

include_directories(${OPENBLAS_DIR}/include)

#Add opencv411
add_library(opencv_java4
        SHARED
        IMPORTED )

set_target_properties(
        # Specifies the target library.
        opencv_java4

        # Specifies the parameter you want to define.
        PROPERTIES IMPORTED_LOCATION

        # Provides the path to the library you want to import.
        ${OPENCV_DIR}/native/libs/${ANDROID_ABI}/libopencv_java4.so)

include_directories(${OPENCV_DIR}/native/jni/include)


# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.

find_library( # Sets the name of the path variable.
        log-lib
        # Specifies the name of the NDK library that
        # you want CMake to locate.
        log)

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
        face
        dlib::dlib
        openblas
        opencv_java4
        # Links the target library to the log library
        # included in the NDK.
        android
        jnigraphics
        ${log-lib})