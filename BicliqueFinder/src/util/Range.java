/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Arrays;

/**
 * Classe que representa uma sequência de valores inteiros. Usado para a
 * implementação dos ataques em paralelo.
 *
 * @author Frog33
 */
public class Range {
    
    /**
     * Método de testes da classe.
     * @param args .
     */
    public static void testador(String[] args){
        Range r = new Range(7, 15);
        System.out.println(r);
        System.out.println(Arrays.toString(r.partition(9)));
    }
    
    /**
     * Primeiro valor da sequência.
     */
    public int begin;
    /**
     * Segundo valor da sequência.
     */
    public int end;
    
    
    /**
     * Construtor padrão simples.
     * @param a Primeiro inteiro da sequência
     * @param b Primeiro inteiro FORA da sequência. O último é b-1
     */
    public Range(int a, int b){
        begin = a;
        end = b;
    }
    
    /**
     * Retorna o valor na posição <code>position</code> da sequência, começando 
     * em zero.
     * 
     * @param position .
     * @return .
     * @exception RuntimeException caso a posição esteja fora da Range.
     */
    public int get(int position){
        if(position < 0 || position >= size())
            throw new RuntimeException("Não é possível retornar valor fora da"
                    + " Range.");
        return begin + position;
    }
    
    
    /**
     * Retorna o tamanho da Range.
     * @return .
     */
    public int size(){
        return end - begin;
    }
    
    /**
     * Retorna o valor do somatório de todos os tamanhos das Ranges pertencentes
     * a <code>ranges</code>.
     * @param ranges .
     * @return .
     */
    public static int sum(Range ranges[]){
        int result = 1;
        for (Range r : ranges) 
            result*=r.size();        
        return result;
    }
    
    /**
     * Cria um vetor com as <code>num</code> partições desta Range. Caso
     * <code>num</code> não divida o tamanho da Range, a última partição será 
     * menor que as outras.
     * @param num .
     * @return .
     */
    public Range[] partition(int num){
        if(num > size())
            throw new RuntimeException("Não é possível particionar o Range"
                    + "quando o número de partições é maior que seu tamanho. ("
                    + size()  + " < " + num + ")");
        
        
        Range result[] = new Range[num];
        int ini = begin,fim = begin, step = size() / num, rest = size() % num;
        
        for (int i = 0; i < result.length; i++) {
            fim += step;
            if (i < rest) 
                result[i] = new Range(ini, ++fim);
            else
                result[i] = new Range(ini, fim);
            ini = fim;
        }
        return result;
    }
    
    @Override
    public String toString(){
        return "(" + begin + " ... " + (end-1) + ")";// + " size : "+size();
    }
}
