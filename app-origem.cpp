#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_criadorapps_MainActivity_getNativeFunction(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Função C++ executada!";
    return env->NewStringUTF(hello.c_str());
}
