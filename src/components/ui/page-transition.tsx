
import React, { useState, useEffect } from "react";
import { cn } from "@/lib/utils";

interface PageTransitionProps {
  children: React.ReactNode;
  className?: string;
  animationType?: 'fade' | 'slide-up' | 'slide-down';
  duration?: number;
}

export function PageTransition({
  children,
  className,
  animationType = 'fade',
  duration = 300,
}: PageTransitionProps) {
  const [isVisible, setIsVisible] = useState(false);

  useEffect(() => {
    const timer = setTimeout(() => {
      setIsVisible(true);
    }, 50);

    return () => clearTimeout(timer);
  }, []);

  const getAnimationClass = () => {
    switch (animationType) {
      case 'slide-up':
        return 'animate-slide-up';
      case 'slide-down':
        return 'animate-slide-down';
      case 'fade':
      default:
        return 'animate-fade-in';
    }
  };

  return (
    <div
      className={cn(
        "transition-opacity",
        isVisible ? getAnimationClass() : 'opacity-0',
        className
      )}
      style={{ animationDuration: `${duration}ms` }}
    >
      {children}
    </div>
  );
}
