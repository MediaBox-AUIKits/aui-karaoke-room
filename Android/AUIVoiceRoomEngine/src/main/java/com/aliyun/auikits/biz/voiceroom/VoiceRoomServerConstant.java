package com.aliyun.auikits.biz.voiceroom;

public class VoiceRoomServerConstant {
    public static final String APP_ID = "79a51aa1-7127-4f32-90ce-cdfe618835d9";
    public static final String HOST = "https://chatroom.h5video.vip";
    public static final String RTC_GLSB = "https://gw.rtn.aliyuncs.com";
    public static final String JOIN_SEAT_URL = HOST + "/api/chatroom/joinMic";
    public static final String LEAVE_SEAT_URL = HOST + "/api/chatroom/leaveMic";
    public static final String GET_SEAT_LIST_URL = HOST + "/api/chatroom/getMeetingInfo";
    public static final String GET_IM_TOKEN_URL = "/api/chatroom/token";
    public static final String LOGIN_URL = "/login";
    public static final String GET_RTC_TOKEN_URL = "/api/chatroom/getRtcAuthToken";
    public static final String GET_CHAT_ROOM_LIST_URL = "/api/chatroom/list";
    public static final String GET_CHAT_ROOM_INFO_URL = "/api/chatroom/get";
    public static final String DISMISS_CHAT_ROOM_URL = "/api/chatroom/dismiss";
    public static final String CREATE_CHAT_ROOM_URL = "/api/chatroom/create";
}
