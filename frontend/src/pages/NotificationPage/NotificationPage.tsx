import Item from "./NotificationPage.Item";

import xIcon from "../../assets/icon/xIcon.png";

type NotificationType = {
  notificationId: number;
  senderId: number;
  accountId: number;
  notificationType: string;
  amount: number;
  createTime: string;
  read: boolean;
};

interface NotificationModalProps {
  hidden: boolean;
  changeNotiHidden: (hidden: boolean) => void;
  notiList: Array<NotificationType>;
}

function Notification({
  hidden,
  changeNotiHidden,
  notiList,
}: NotificationModalProps) {
  return (
    <div
      className={`font-bold absolute w-[360px] h-[350px] bottom-[60px] bg-gray-100 bg-opacity-90 px-2 py-5 rounded-t-2xl ${hidden ? "hidden" : ""}`}
    >
      <div className="flex justify-between items-center mx-5 mb-3">
        <h1 className="text-lg">알림</h1>
        <img
          src={xIcon}
          alt="창닫기"
          className="w-[10px] cursor-pointer"
          onClick={() => changeNotiHidden(hidden)}
          role="presentation"
        />
      </div>
      <div className="h-[90%] overflow-auto scrollbar-hide">
        {notiList ? (
          <div className="px-2">
            {notiList.map((noti) => (
              <Item item={noti} key={noti.createTime} />
            ))}
          </div>
        ) : (
          <span>알림 내역이 없습니다.</span>
        )}
      </div>
    </div>
  );
}

export default Notification;
