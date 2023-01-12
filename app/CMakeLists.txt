cmake_minimum_required(VERSION 3.4.1)


set(var hello)
message(${var})

add_library( # Sets the name of the library.
        native-lib

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        src/main/cpp/native-lib.cpp
        )


add_library(

        people-lib

        SHARED

        src/main/cpp/people/people.cpp

)

include_directories(src/main/cpp/people/)

find_library( # Sets the name of the path variable.
        log-lib

        # Specifies the name of the NDK library that
        # you want CMake to locate.
        log)

target_link_libraries( # Specifies the target library.
        native-lib

        people-lib

        # Links the target library to the log library
        # included in the NDK.
        ${log-lib})