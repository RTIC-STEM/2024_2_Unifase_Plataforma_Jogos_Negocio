
import React from "react";
import { cn } from "@/lib/utils";
import { BlurCard } from "@/components/ui/blur-card";
import { TrendingUp, TrendingDown, PieChart, Heart, DollarSign, Users, ShoppingCart } from "lucide-react";

interface MetricCardProps {
  title: string;
  value: string;
  trend: string;
  icon: "trending-up" | "trending-down" | "pie-chart" | "heart" | "dollar-sign" | "users" | "shopping-cart";
  color: "red" | "green" | "blue" | "purple" | "pink" | "yellow" | "orange";
}

export function MetricCard({ title, value, trend, icon, color }: MetricCardProps) {
  const iconMap = {
    "trending-up": <TrendingUp className="h-5 w-5" />,
    "trending-down": <TrendingDown className="h-5 w-5" />,
    "pie-chart": <PieChart className="h-5 w-5" />,
    "heart": <Heart className="h-5 w-5" />,
    "dollar-sign": <DollarSign className="h-5 w-5" />,
    "users": <Users className="h-5 w-5" />,
    "shopping-cart": <ShoppingCart className="h-5 w-5" />
  };

  const colorClasses = {
    red: {
      bg: "bg-red-500/10",
      text: "text-red-600 dark:text-red-400",
      trend: "text-red-600 dark:text-red-400"
    },
    green: {
      bg: "bg-green-500/10",
      text: "text-green-600 dark:text-green-400",
      trend: "text-green-600 dark:text-green-400"
    },
    blue: {
      bg: "bg-business-blue/10",
      text: "text-business-blue dark:text-business-blue",
      trend: "text-business-blue dark:text-business-blue"
    },
    purple: {
      bg: "bg-purple-500/10",
      text: "text-purple-600 dark:text-purple-400",
      trend: "text-purple-600 dark:text-purple-400"
    },
    pink: {
      bg: "bg-pink-500/10",
      text: "text-pink-600 dark:text-pink-400",
      trend: "text-pink-600 dark:text-pink-400"
    },
    yellow: {
      bg: "bg-yellow-500/10",
      text: "text-yellow-600 dark:text-yellow-400",
      trend: "text-yellow-600 dark:text-yellow-400"
    },
    orange: {
      bg: "bg-orange-500/10",
      text: "text-orange-600 dark:text-orange-400",
      trend: "text-orange-600 dark:text-orange-400"
    }
  };

  const isTrendPositive = trend.startsWith("+");

  return (
    <BlurCard className="relative overflow-hidden">
      <div className="flex items-start justify-between">
        <div>
          <p className="text-sm font-medium text-muted-foreground">{title}</p>
          <h3 className="mt-2 text-2xl font-bold">{value}</h3>
          <div className={cn(
            "mt-1 text-sm font-medium flex items-center",
            isTrendPositive ? "text-green-600 dark:text-green-400" : "text-red-600 dark:text-red-400"
          )}>
            {isTrendPositive ? 
              <TrendingUp className="mr-1 h-4 w-4" /> : 
              <TrendingDown className="mr-1 h-4 w-4" />
            }
            {trend}
          </div>
        </div>
        <div className={cn("p-2 rounded-full", colorClasses[color].bg)}>
          <div className={colorClasses[color].text}>
            {iconMap[icon]}
          </div>
        </div>
      </div>
      
      {/* Decoration */}
      <div className="absolute -right-3 -bottom-3 h-24 w-24 rounded-full bg-gradient-to-r from-transparent to-business-blue/5 dark:to-business-blue/10" />
    </BlurCard>
  );
}
