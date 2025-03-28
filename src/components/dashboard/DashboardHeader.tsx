
import React from "react";
import { useNavigate } from "react-router-dom";
import { UserCircle, Bell, Search } from "lucide-react";
import { Input } from "@/components/ui/input";
import { Button } from "@/components/ui/button";
import { Avatar, AvatarFallback, AvatarImage } from "@/components/ui/avatar";

interface DashboardHeaderProps {
  companyName: string;
}

export function DashboardHeader({ companyName }: DashboardHeaderProps) {
  const navigate = useNavigate();
  const today = new Date().toLocaleDateString('pt-BR', { 
    weekday: 'long', 
    year: 'numeric', 
    month: 'long', 
    day: 'numeric' 
  });
  
  return (
    <header className="sticky top-0 z-30 flex h-16 items-center gap-4 border-b bg-background px-6 dark:border-business-navy/30">
      <div className="flex flex-1 items-center justify-between">
        <div>
          <h1 className="text-lg font-semibold">{companyName}</h1>
          <p className="text-xs text-muted-foreground capitalize">{today}</p>
        </div>
        
        <div className="relative hidden lg:flex items-center">
          <Search className="absolute left-2.5 h-4 w-4 text-muted-foreground" />
          <Input
            type="search"
            placeholder="Pesquisar..."
            className="w-64 pl-8 rounded-full bg-background"
          />
        </div>
        
        <div className="flex items-center gap-4">
          <Button variant="ghost" size="icon" className="relative">
            <Bell className="h-5 w-5" />
            <span className="absolute top-1 right-1.5 h-2 w-2 rounded-full bg-business-blue" />
          </Button>
          
          <div className="flex items-center gap-2">
            <span className="text-sm font-medium hidden md:inline-block">
              CEO
            </span>
            <Avatar>
              <AvatarImage src="https://i.pravatar.cc/100" alt="Avatar" />
              <AvatarFallback>
                <UserCircle className="h-6 w-6" />
              </AvatarFallback>
            </Avatar>
          </div>
        </div>
      </div>
    </header>
  );
}
