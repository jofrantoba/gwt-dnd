/*
 * Copyright 2007 Fred Sauer
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.allen_sauer.gwt.dragdrop.client.util;

/**
 * Class representing a rectangular region, with convenience methods for
 * calculations.
 */
public interface Area {
  /**
   * Clone our area.
   * 
   * @return the new area
   */
  public abstract Area copyOf();

  /**
   * Determine the shortest distance from the location to the edge of the area.
   * Zero indicates a location on the edge. Negative distances indicate a
   * location inside the area.
   * 
   * @param location the reference location
   * @return shortest distance to edge of area
   */
  public int distanceToEdge(Location location);

  public abstract int getBottom();

  public abstract Location getCenter();

  public abstract int getHeight();

  public abstract int getLeft();

  public abstract int getRight();

  /**
   * Determine area (width * height).
   * 
   * @return size of area
   */
  public abstract int getSize();

  public abstract int getTop();

  public abstract int getWidth();

  /**
   * Determine if location is to the bottom-right of the following 45 degree
   * line.
   * 
   * <pre>
   *             y  45
   *             | /
   *             |/   
   *        -----+----- x
   *            /|
   *           / |
   * 
   * </pre>
   * 
   * @param location the location to consider
   * @return true if the location is to below the 45 degree line
   */
  public abstract boolean inBottomRight(Location location);

  /**
   * Determine if the target area intersects our area
   * 
   * @param targetArea the area to compare to
   * @return true if target area intersects our area
   */
  public abstract boolean intersects(Area targetArea);

  /**
   * Determine if the provided location intersects with our area.
   * 
   * @param location the location to examine
   * @return true if the location falls within our area
   */
  public abstract boolean intersects(Location location);

  /**
   * Translate our top left position to the new location.
   * 
   * @param location the position to translate to
   */
  public abstract void moveTo(Location location);
}