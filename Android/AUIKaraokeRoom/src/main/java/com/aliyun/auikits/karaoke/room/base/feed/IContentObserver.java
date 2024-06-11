package com.aliyun.auikits.karaoke.room.base.feed;

import java.util.List;

public interface IContentObserver<T> {
    void onContentUpdate(List<T> data);
    void onContentInsert(List<T> data);
    void onContentRemove(List<T> data);
    void onContentUpdate(T data, int position);
}
