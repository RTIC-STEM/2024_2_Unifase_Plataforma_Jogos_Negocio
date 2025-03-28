
import * as React from "react";
import { cn } from "@/lib/utils";

interface BlurCardProps extends React.HTMLAttributes<HTMLDivElement> {
  className?: string;
  children: React.ReactNode;
  hoverEffect?: boolean;
  animatedBorder?: boolean;
}

const BlurCard = React.forwardRef<HTMLDivElement, BlurCardProps>(
  ({ className, children, hoverEffect = true, animatedBorder = false, ...props }, ref) => {
    return (
      <div
        ref={ref}
        className={cn(
          "glass-card p-6",
          hoverEffect && "hover:scale-[1.01] hover:-translate-y-1",
          animatedBorder && "animated-border",
          className
        )}
        {...props}
      >
        {children}
      </div>
    );
  }
);

BlurCard.displayName = "BlurCard";

export { BlurCard };
