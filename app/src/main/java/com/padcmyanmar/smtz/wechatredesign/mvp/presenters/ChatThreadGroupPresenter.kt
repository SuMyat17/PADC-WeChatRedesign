package com.padcmyanmar.smtz.wechatredesign.mvp.presenters

import android.graphics.Bitmap
import androidx.lifecycle.LifecycleOwner
import com.padc.grocery.mvp.presenters.BasePresenter
import com.padcmyanmar.smtz.wechatredesign.data.vos.GroupVO
import com.padcmyanmar.smtz.wechatredesign.delegates.GroupToChatThreadDelegate
import com.padcmyanmar.smtz.wechatredesign.mvp.views.ChatThreadGroupView

interface ChatThreadGroupPresenter : BasePresenter<ChatThreadGroupView> {
    fun onUiReady(owner: LifecycleOwner, group: GroupVO)
    fun onTapSend(
        millis: Long,
        groupName: String,
        message: String,
        senderUID: String,
        senderName: String,
        senderProfile: String,
        file: List<Bitmap>
    )
}