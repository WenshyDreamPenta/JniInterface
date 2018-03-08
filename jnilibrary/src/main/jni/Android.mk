LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := JniInterface
LOCAL_SRC_FILES := JniInterface.c

include $(BUILD_SHARED_LIBRARY)