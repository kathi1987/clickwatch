/*
 * Created on May 5, 2004
 *
 * Copyright (c) 2004, the JUNG Project and the Regents of the University 
 * of California
 * All rights reserved.
 *
 * This software is open-source under the BSD license; see either
 * "license.txt" or
 * http://jung.sourceforge.net/license.txt for a description.
 */
package edu.uci.ics.jung.graph.decorators;

import edu.uci.ics.jung.graph.ArchetypeVertex;


/**
 * An interface for classes that provide a way to fetch a label
 * for a specified vertex.
 * 
 * @author Joshua O'Madadhain
 */
public interface VertexStringer
{
    public String getLabel(ArchetypeVertex v);
}
