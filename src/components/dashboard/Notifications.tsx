
import React from "react";
import { cn } from "@/lib/utils";
import { AlertTriangle, Info, CheckCircle, Bell } from "lucide-react";
import { Button } from "@/components/ui/button";

interface NotificationItem {
  id: number;
  type: "warning" | "info" | "success";
  message: string;
  time: string;
}

interface NotificationsProps {
  notifications: NotificationItem[];
}

export function Notifications({ notifications }: NotificationsProps) {
  const getNotificationIcon = (type: string) => {
    switch (type) {
      case "warning":
        return <AlertTriangle className="h-5 w-5 text-amber-500" />;
      case "info":
        return <Info className="h-5 w-5 text-business-blue" />;
      case "success":
        return <CheckCircle className="h-5 w-5 text-green-500" />;
      default:
        return <Bell className="h-5 w-5 text-gray-500" />;
    }
  };

  const getNotificationClass = (type: string) => {
    switch (type) {
      case "warning":
        return "border-l-amber-500 bg-amber-50 dark:bg-amber-950/20";
      case "info":
        return "border-l-business-blue bg-blue-50 dark:bg-business-blue/10";
      case "success":
        return "border-l-green-500 bg-green-50 dark:bg-green-950/20";
      default:
        return "border-l-gray-500 bg-gray-50 dark:bg-gray-800/20";
    }
  };

  return (
    <div className="space-y-3">
      {notifications.length === 0 ? (
        <div className="text-center py-8">
          <Bell className="mx-auto h-10 w-10 text-muted-foreground/50" />
          <p className="mt-2 text-sm text-muted-foreground">
            Nenhuma notificação no momento
          </p>
        </div>
      ) : (
        <>
          {notifications.map((notification) => (
            <div
              key={notification.id}
              className={cn(
                "p-3 border-l-4 rounded-r-md flex items-start",
                getNotificationClass(notification.type)
              )}
            >
              <div className="flex-shrink-0 mr-3 mt-0.5">
                {getNotificationIcon(notification.type)}
              </div>
              <div className="flex-1">
                <p className="text-sm">{notification.message}</p>
                <p className="text-xs text-muted-foreground mt-1">
                  {notification.time}
                </p>
              </div>
            </div>
          ))}
          <div className="pt-2 text-center">
            <Button variant="ghost" size="sm" className="text-business-blue">
              Ver todas as notificações
            </Button>
          </div>
        </>
      )}
    </div>
  );
}
