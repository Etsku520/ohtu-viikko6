/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

/**
 *
 * @author hceetu
 */
public class QueryBuilder {
    Matcher build;

    public QueryBuilder() {
        build = new All();
    }

    public QueryBuilder(Matcher build) {
        this.build = build;
    }
    
    
    public QueryBuilder playsIn(String team) {
        return new QueryBuilder(new And(build, new PlaysIn(team)));
    }
    
    public QueryBuilder hasAtLeast(int value, String category) {
        return new QueryBuilder(new And(build, new HasAtLeast(value, category)));
    }
    
    public QueryBuilder hasFewerThan(int value, String category) {
        return new QueryBuilder(new And(build, new HasFewerThan(value, category)));
    }
    
    public Matcher build() {
        return build;
    }
}
