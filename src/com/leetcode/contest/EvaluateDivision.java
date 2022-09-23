package com.leetcode.contest;

import java.util.*;

/*
399. Evaluate Division
 */
public class EvaluateDivision {
    public static void main(String[] args) {
        EvaluateDivision ed = new EvaluateDivision();

    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        double[] result = new double[equations.size()];
        var graph = buildGraph(equations,values);
        for(int i = 0;i<queries.size();i++)
        {
            result[i] = getProductWeight(queries.get(i).get(0),queries.get(i).get(1),graph, new HashSet<>());
        }
        return result;
    }

    double getProductWeight(String start, String end, Map<String, Map<String, Double>> graph, Set<String> visited)
    {
        if(!graph.containsKey(start))
            return -1;
        if(graph.get(start).containsKey(end))
            return graph.get(start).get(end);

        visited.add(start);
        for(Map.Entry<String, Double> neighbour : graph.get(start).entrySet())
        {
            if(!visited.contains(neighbour.getKey()))
            {
                double productWeight = getProductWeight(neighbour.getKey(),end,graph,visited);
                if(productWeight!=-1)
                    return productWeight * neighbour.getValue();
            }
        }

        return -1;
    }

    Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values)
    {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for(int i = 0;i<equations.size();i++)
        {
            String divisor = equations.get(i).get(0);
            String dividend = equations.get(i).get(1);
            double quotient = values[i];
            graph.putIfAbsent(dividend, new HashMap<>());
            graph.putIfAbsent(divisor, new HashMap<>());
            graph.get(divisor).put(dividend,quotient);
            graph.get(dividend).put(divisor,1/quotient);
            /*
            a/b = 3;
            a->b->3
            b/a = 1/3
            b->a->1/3
             */
        }
        return graph;
    }
}
