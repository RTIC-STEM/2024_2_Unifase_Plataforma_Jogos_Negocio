
import React from "react";
import { useNavigate } from "react-router-dom";
import { cn } from "@/lib/utils";
import { Logo } from "@/components/Logo";
import { 
  Home, BarChart3, CreditCard, Users, PackageOpen, 
  BrainCircuit, Settings, LogOut, Bell
} from "lucide-react";
import { Button } from "@/components/ui/button";
import { Separator } from "@/components/ui/separator";

interface SideMenuProps {
  currentView: string;
  setCurrentView: (view: string) => void;
}

export function SideMenu({ currentView, setCurrentView }: SideMenuProps) {
  const navigate = useNavigate();
  
  const menuItems = [
    { id: "dashboard", label: "Dashboard", icon: Home },
    { id: "financeiro", label: "Financeiro", icon: BarChart3 },
    { id: "marketing", label: "Marketing", icon: PackageOpen },
    { id: "rh", label: "Recursos Humanos", icon: Users },
    { id: "producao", label: "Produção", icon: CreditCard },
    { id: "decisoes", label: "Decisões Estratégicas", icon: BrainCircuit },
  ];
  
  return (
    <div className="w-64 bg-white dark:bg-business-navy/50 border-r border-gray-200 dark:border-business-navy/30 shadow-sm p-4 flex flex-col h-screen">
      <div className="p-2">
        <Logo size="md" variant="primary" />
      </div>
      
      <Separator className="my-4" />
      
      <nav className="space-y-1 flex-1">
        {menuItems.map((item) => {
          const Icon = item.icon;
          return (
            <Button
              key={item.id}
              variant={currentView === item.id ? "default" : "ghost"}
              className={cn(
                "w-full justify-start",
                currentView === item.id 
                  ? "bg-business-navy/10 dark:bg-white/10 text-business-navy dark:text-white" 
                  : "text-gray-700 dark:text-gray-300"
              )}
              onClick={() => setCurrentView(item.id)}
            >
              <Icon className="mr-2 h-4 w-4" />
              {item.label}
            </Button>
          );
        })}
      </nav>
      
      <div className="pt-4 space-y-1 border-t border-gray-200 dark:border-business-navy/30">
        <Button variant="ghost" className="w-full justify-start text-gray-700 dark:text-gray-300">
          <Bell className="mr-2 h-4 w-4" />
          Notificações
        </Button>
        <Button variant="ghost" className="w-full justify-start text-gray-700 dark:text-gray-300">
          <Settings className="mr-2 h-4 w-4" />
          Configurações
        </Button>
        <Button 
          variant="ghost" 
          className="w-full justify-start text-gray-700 dark:text-gray-300"
          onClick={() => navigate("/")}
        >
          <LogOut className="mr-2 h-4 w-4" />
          Sair
        </Button>
      </div>
    </div>
  );
}
