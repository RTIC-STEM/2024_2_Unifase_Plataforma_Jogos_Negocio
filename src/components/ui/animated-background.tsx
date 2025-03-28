
import React from "react";
import { cn } from "@/lib/utils";

interface AnimatedBackgroundProps {
  className?: string;
  pattern?: 'dots' | 'grid' | 'none';
  animated?: boolean;
  children?: React.ReactNode;
}

export function AnimatedBackground({
  className,
  pattern = 'dots',
  animated = true,
  children
}: AnimatedBackgroundProps) {
  const patternClass = pattern === 'dots' 
    ? 'bg-dots-pattern' 
    : pattern === 'grid' 
      ? 'bg-grid-pattern' 
      : '';

  return (
    <div className={cn(
      "relative w-full h-full overflow-hidden",
      className
    )}>
      {/* Background with pattern */}
      <div className={cn(
        "absolute inset-0 w-full h-full",
        patternClass
      )} />
      
      {/* Animated gradient orbs */}
      {animated && (
        <>
          <div className="absolute -top-20 -left-20 w-72 h-72 bg-business-blue/20 rounded-full filter blur-3xl opacity-50 animate-float" />
          <div className="absolute top-1/3 -right-20 w-96 h-96 bg-business-teal/20 rounded-full filter blur-3xl opacity-40 animate-float animation-delay-2000" />
          <div className="absolute -bottom-40 left-1/3 w-80 h-80 bg-business-navy/20 rounded-full filter blur-3xl opacity-30 animate-float animation-delay-4000" />
        </>
      )}
      
      {/* Content */}
      <div className="relative z-10">
        {children}
      </div>
    </div>
  );
}
