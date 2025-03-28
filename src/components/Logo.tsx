
import React from "react";
import { cn } from "@/lib/utils";

interface LogoProps {
  className?: string;
  size?: 'sm' | 'md' | 'lg';
  variant?: 'primary' | 'light' | 'dark';
  withText?: boolean;
  institutionalLogo?: string;
  institutionalName?: string;
}

export function Logo({ 
  className, 
  size = 'md', 
  variant = 'primary', 
  withText = true, 
  institutionalLogo = "/lovable-uploads/d6911f5c-f379-4696-876b-d5c72cebb949.png",
  institutionalName = "Business Strategy"
}: LogoProps) {
  const sizeClasses = {
    sm: 'h-8',
    md: 'h-10',
    lg: 'h-16'
  };

  const variantClasses = {
    primary: 'text-business-navy dark:text-white',
    light: 'text-white',
    dark: 'text-business-navy'
  };

  return (
    <div className={cn("flex items-center", className)}>
      <img 
        src={institutionalLogo} 
        alt={institutionalName}
        className={cn(sizeClasses[size], "object-contain")}
      />
      {withText && (
        <span className={cn(
          "ml-2 font-bold tracking-tight",
          variantClasses[variant],
          size === 'sm' ? 'text-lg' : size === 'md' ? 'text-xl' : 'text-2xl'
        )}>
          {institutionalName}
        </span>
      )}
    </div>
  );
}
