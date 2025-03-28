
import React from "react";
import { 
  LineChart, 
  Line, 
  XAxis, 
  YAxis, 
  CartesianGrid, 
  Tooltip, 
  Legend, 
  ResponsiveContainer 
} from "recharts";

export function FinancialChart() {
  // Dados mockados para o gráfico de evolução financeira
  const data = [
    { rodada: "1", receita: 4000, custos: 2400, lucro: 1600 },
    { rodada: "2", receita: 5000, custos: 2800, lucro: 2200 },
    { rodada: "3", receita: 6000, custos: 3200, lucro: 2800 },
    { rodada: "4", receita: 8000, custos: 4000, lucro: 4000 },
    { rodada: "5", receita: 10000, custos: 4800, lucro: 5200 },
    { rodada: "6", receita: 9500, custos: 5000, lucro: 4500 },
    { rodada: "7", receita: 11000, custos: 5200, lucro: 5800 }
  ];

  return (
    <ResponsiveContainer width="100%" height={300}>
      <LineChart
        data={data}
        margin={{ top: 5, right: 30, left: 20, bottom: 5 }}
      >
        <CartesianGrid strokeDasharray="3 3" opacity={0.2} />
        <XAxis 
          dataKey="rodada" 
          label={{ value: 'Rodadas', position: 'bottom', offset: 0 }} 
        />
        <YAxis 
          label={{ 
            value: 'Valor (R$)', 
            angle: -90, 
            position: 'insideLeft',
            style: { textAnchor: 'middle' }
          }} 
        />
        <Tooltip formatter={(value) => `R$ ${value}`} />
        <Legend />
        <Line 
          type="monotone" 
          dataKey="receita" 
          stroke="#4338ca" 
          strokeWidth={2} 
          activeDot={{ r: 8 }} 
          name="Receita"
        />
        <Line 
          type="monotone" 
          dataKey="custos" 
          stroke="#ef4444" 
          strokeWidth={2}
          name="Custos"
        />
        <Line 
          type="monotone" 
          dataKey="lucro" 
          stroke="#10b981" 
          strokeWidth={2}
          name="Lucro"
        />
      </LineChart>
    </ResponsiveContainer>
  );
}
