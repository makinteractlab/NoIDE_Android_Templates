# README

You can compile and install this Android applciation withtout Android studio.


## Prerequisites

See reference: https://developer.okta.com/blog/2018/08/10/basic-android-without-an-ide

1) Install Android SDK
2) Setup path varibales as this for example:

```
export ANDROID_HOME=/Users/USERNAME/Library/Android/sdk
export ANDROID_SDK_ROOT=/Users/USERNAME/Library/Android/sdk
export ANDROID_AVD_HOME=/Users/USERNAME/.android/avdandreaimac
```

3) Navigate to MyApp folder
4) Build: ./gradlew build
5) Clean: ./gradlew clean
6) Install on device or emulator: ./gradlew installDebug