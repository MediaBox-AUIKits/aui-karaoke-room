package com.aliyun.auikits.karaoke.room.model.entity.network;

import android.text.TextUtils;

import com.aliyun.auikits.karaoke.room.util.GsonHolder;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class KTVRoomResponse extends BaseResponse {

    public String id;
    public String created_at;
    public String updated_at;
    public String title;
    public String notice;
    public String cover_url;
    public String anchor_id;
    public String anchor_nick;
    @SerializedName("extends")
    public String exd;
    public int status;
    public String chat_id;
    public KTVRoomMetrics metrics;

    public boolean isRoomValid() {
        return status == 1;
    }

    public int getOnlineCount() {
        if(this.metrics != null) {
            return this.metrics.online_count;
        }
        return 0;
    }

    public String getAnchorAvatar() {
        if(TextUtils.isEmpty(exd)) {
            return "";
        } else {
            Map<String,Object> extMap = GsonHolder.gson.fromJson(exd, Map.class);
            return (String) extMap.get(KTVRoomRspItem.KEY_ANCHOR_AVATAR);
        }

    }
}
