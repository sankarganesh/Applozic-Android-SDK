package com.applozic.mobicomkit.uiwidgets;

import com.applozic.mobicommons.json.JsonMarker;

/**
 * Created by sunil on 10/10/16.
 */
public class AlCustomizationSettings extends JsonMarker {


    public String customMessageBackgroundColor = "#FF03A9F4";
    private String sentMessageBackgroundColor = "#FF03A9F4";
    private String receivedMessageBackgroundColor = "#FFFFFFFF";
    private String sendButtonBackgroundColor = "#FF03A9F4";
    private String attachmentIconsBackgroundColor = "#FF03A9F4";
    private String chatBackgroundColorOrDrawable;
    private String editTextBackgroundColorOrDrawable;
    private String editTextLayoutBackgroundColorOrDrawable;
    private String channelCustomMessageBgColor = "#cccccc";

    private String sentContactMessageTextColor = "#FFFFFFFF";
    private String receivedContactMessageTextColor = "#000000";
    private String sentMessageTextColor = "#FFFFFFFF";
    private String receivedMessageTextColor = "#000000";
    private String messageEditTextTextColor = "#000000";
    private String sentMessageLinkTextColor = "#5fba7d";
    private String receivedMessageLinkTextColor = "#000000";
    private String messageEditTextHintTextColor = "#bdbdbd";
    private String typingTextColor;
    private String noConversationLabelTextColor = "#000000";
    private String conversationDateTextColor = "#333333";
    private String conversationDayTextColor = "#333333";
    private String messageTimeTextColor = "#838b83";
    private String channelCustomMessageTextColor = "#666666";

    private String sentMessageBorderColor = "#FF03A9F4";
    private String receivedMessageBorderColor = "#FFFFFFFF";
    private String channelCustomMessageBorderColor = "#cccccc";

    private String audioPermissionNotFoundMsg;
    private String noConversationLabel = "You have no conversations";
    private String noSearchFoundForChatMessages = "No conversation found";

    private boolean locationShareViaMap = true;
    private boolean startNewFloatingButton;
    private boolean startNewButton;
    private boolean onlineStatusMasterList;
    private boolean priceWidget;
    private boolean startNewGroup = true;
    private boolean imageCompression;
    private boolean inviteFriendsInContactActivity;
    private boolean registeredUserContactListCall;
    private boolean createAnyContact;
    private boolean showActionDialWithOutCalling;
    private boolean profileLogoutButton;
    private boolean userProfileFragment = true;
    private boolean messageSearchOption;
    private boolean conversationContactImageVisibility = true;
    private boolean hideGroupAddMembersButton;
    private boolean hideGroupNameUpdateButton;
    private boolean hideGroupExitButton;
    private boolean hideGroupRemoveMemberOption;
    private boolean profileOption;

    private int totalRegisteredUserToFetch = 100;
    private int maxAttachmentAllowed = 5;
    private int maxAttachmentSizeAllowed = 30;
    private int totalOnlineUsers = 0;


    public boolean isStartNewFloatingButton() {
        return startNewFloatingButton;
    }

    public boolean isStartNewButton() {
        return startNewButton;
    }

    public String getNoConversationLabel() {
        return noConversationLabel;
    }

    public String getCustomMessageBackgroundColor() {
        return customMessageBackgroundColor;
    }


    public String getSentMessageBackgroundColor() {
        return sentMessageBackgroundColor;
    }

    public String getReceivedMessageBackgroundColor() {
        return receivedMessageBackgroundColor;
    }

    public boolean isOnlineStatusMasterList() {
        return onlineStatusMasterList;
    }

    public boolean isPriceWidget() {
        return priceWidget;
    }

    public String getSendButtonBackgroundColor() {
        return sendButtonBackgroundColor;
    }

    public boolean isStartNewGroup() {
        return startNewGroup;
    }

    public boolean isImageCompression() {
        return imageCompression;
    }


    public boolean isInviteFriendsInContactActivity() {
        return inviteFriendsInContactActivity;
    }

    public String getAttachmentIconsBackgroundColor() {
        return attachmentIconsBackgroundColor;
    }

    public boolean isLocationShareViaMap() {
        return locationShareViaMap;
    }

    public boolean isConversationContactImageVisibility() {
        return conversationContactImageVisibility;
    }

    public String getSentContactMessageTextColor() {
        return sentContactMessageTextColor;
    }

    public String getReceivedContactMessageTextColor() {
        return receivedContactMessageTextColor;
    }

    public String getSentMessageTextColor() {
        return sentMessageTextColor;
    }

    public String getReceivedMessageTextColor() {
        return receivedMessageTextColor;
    }

    public String getSentMessageBorderColor() {
        return sentMessageBorderColor;
    }

    public String getReceivedMessageBorderColor() {
        return receivedMessageBorderColor;
    }

    public String getChatBackgroundColorOrDrawable() {
        return chatBackgroundColorOrDrawable;
    }

    public String getMessageEditTextTextColor() {
        return messageEditTextTextColor;
    }

    public String getAudioPermissionNotFoundMsg() {
        return audioPermissionNotFoundMsg;
    }

    public boolean isRegisteredUserContactListCall() {
        return registeredUserContactListCall;
    }

    public boolean isCreateAnyContact() {
        return createAnyContact;
    }

    public boolean isShowActionDialWithOutCalling() {
        return showActionDialWithOutCalling;
    }

    public String getSentMessageLinkTextColor() {
        return sentMessageLinkTextColor;
    }

    public String getReceivedMessageLinkTextColor() {
        return receivedMessageLinkTextColor;
    }

    public String getMessageEditTextHintTextColor() {
        return messageEditTextHintTextColor;
    }

    public boolean isHideGroupAddMembersButton() {
        return hideGroupAddMembersButton;
    }

    public boolean isHideGroupNameUpdateButton() {
        return hideGroupNameUpdateButton;
    }

    public boolean isHideGroupExitButton() {
        return hideGroupExitButton;
    }

    public boolean isHideGroupRemoveMemberOption() {
        return hideGroupRemoveMemberOption;
    }


    public String getEditTextBackgroundColorOrDrawable() {
        return editTextBackgroundColorOrDrawable;
    }

    public String getEditTextLayoutBackgroundColorOrDrawable() {
        return editTextLayoutBackgroundColorOrDrawable;
    }

    public String getTypingTextColor() {
        return typingTextColor;
    }

    public boolean isProfileOption() {
        return profileOption;
    }

    public String getNoConversationLabelTextColor() {
        return noConversationLabelTextColor;
    }

    public String getConversationDateTextColor() {
        return conversationDateTextColor;
    }

    public String getConversationDayTextColor() {
        return conversationDayTextColor;
    }

    public String getMessageTimeTextColor() {
        return messageTimeTextColor;
    }

    public String getChannelCustomMessageBgColor() {
        return channelCustomMessageBgColor;
    }

    public String getChannelCustomMessageBorderColor() {
        return channelCustomMessageBorderColor;
    }

    public String getChannelCustomMessageTextColor() {
        return channelCustomMessageTextColor;
    }

    public String getNoSearchFoundForChatMessages() {
        return noSearchFoundForChatMessages;
    }

    public boolean isProfileLogoutButton() {
        return profileLogoutButton;
    }

    public boolean isUserProfileFragment() {
        return userProfileFragment;
    }

    public boolean isMessageSearchOption() {
        return messageSearchOption;
    }


    public int getTotalRegisteredUserToFetch() {
        return totalRegisteredUserToFetch;
    }


    public int getMaxAttachmentAllowed() {
        return maxAttachmentAllowed;
    }

    public int getMaxAttachmentSizeAllowed() {
        return maxAttachmentSizeAllowed;
    }

    public int getTotalOnlineUsers() {
        return totalOnlineUsers;
    }

    @Override
    public String toString() {
        return "AlCustomizationSettings{" +
                "customMessageBackgroundColor='" + customMessageBackgroundColor + '\'' +
                ", sentMessageBackgroundColor='" + sentMessageBackgroundColor + '\'' +
                ", receivedMessageBackgroundColor='" + receivedMessageBackgroundColor + '\'' +
                ", sendButtonBackgroundColor='" + sendButtonBackgroundColor + '\'' +
                ", attachmentIconsBackgroundColor='" + attachmentIconsBackgroundColor + '\'' +
                ", chatBackgroundColorOrDrawable='" + chatBackgroundColorOrDrawable + '\'' +
                ", editTextBackgroundColorOrDrawable='" + editTextBackgroundColorOrDrawable + '\'' +
                ", editTextLayoutBackgroundColorOrDrawable='" + editTextLayoutBackgroundColorOrDrawable + '\'' +
                ", channelCustomMessageBgColor='" + channelCustomMessageBgColor + '\'' +
                ", sentContactMessageTextColor='" + sentContactMessageTextColor + '\'' +
                ", receivedContactMessageTextColor='" + receivedContactMessageTextColor + '\'' +
                ", sentMessageTextColor='" + sentMessageTextColor + '\'' +
                ", receivedMessageTextColor='" + receivedMessageTextColor + '\'' +
                ", messageEditTextTextColor='" + messageEditTextTextColor + '\'' +
                ", sentMessageLinkTextColor='" + sentMessageLinkTextColor + '\'' +
                ", receivedMessageLinkTextColor='" + receivedMessageLinkTextColor + '\'' +
                ", messageEditTextHintTextColor='" + messageEditTextHintTextColor + '\'' +
                ", typingTextColor='" + typingTextColor + '\'' +
                ", noConversationLabelTextColor='" + noConversationLabelTextColor + '\'' +
                ", conversationDateTextColor='" + conversationDateTextColor + '\'' +
                ", conversationDayTextColor='" + conversationDayTextColor + '\'' +
                ", messageTimeTextColor='" + messageTimeTextColor + '\'' +
                ", channelCustomMessageTextColor='" + channelCustomMessageTextColor + '\'' +
                ", sentMessageBorderColor='" + sentMessageBorderColor + '\'' +
                ", receivedMessageBorderColor='" + receivedMessageBorderColor + '\'' +
                ", channelCustomMessageBorderColor='" + channelCustomMessageBorderColor + '\'' +
                ", audioPermissionNotFoundMsg='" + audioPermissionNotFoundMsg + '\'' +
                ", noConversationLabel='" + noConversationLabel + '\'' +
                ", noSearchFoundForChatMessages='" + noSearchFoundForChatMessages + '\'' +
                ", locationShareViaMap=" + locationShareViaMap +
                ", startNewFloatingButton=" + startNewFloatingButton +
                ", startNewButton=" + startNewButton +
                ", onlineStatusMasterList=" + onlineStatusMasterList +
                ", priceWidget=" + priceWidget +
                ", startNewGroup=" + startNewGroup +
                ", imageCompression=" + imageCompression +
                ", inviteFriendsInContactActivity=" + inviteFriendsInContactActivity +
                ", registeredUserContactListCall=" + registeredUserContactListCall +
                ", createAnyContact=" + createAnyContact +
                ", showActionDialWithOutCalling=" + showActionDialWithOutCalling +
                ", profileLogoutButton=" + profileLogoutButton +
                ", userProfileFragment=" + userProfileFragment +
                ", messageSearchOption=" + messageSearchOption +
                ", conversationContactImageVisibility=" + conversationContactImageVisibility +
                ", hideGroupAddMembersButton=" + hideGroupAddMembersButton +
                ", hideGroupNameUpdateButton=" + hideGroupNameUpdateButton +
                ", hideGroupExitButton=" + hideGroupExitButton +
                ", hideGroupRemoveMemberOption=" + hideGroupRemoveMemberOption +
                ", profileOption=" + profileOption +
                ", totalRegisteredUserToFetch=" + totalRegisteredUserToFetch +
                ", maxAttachmentAllowed=" + maxAttachmentAllowed +
                ", maxAttachmentSizeAllowed=" + maxAttachmentSizeAllowed +
                ", totalOnlineUsers=" + totalOnlineUsers +
                '}';
    }
}
