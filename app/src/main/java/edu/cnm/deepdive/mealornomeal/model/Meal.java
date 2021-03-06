/*
 * <!--
 *   Copyright 2020 Meal or no Meal
 *  Paul Cutter, Mickie Morlang, Ambar Rodriguez, Levi Sanchez
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0>
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * -->
 */

package edu.cnm.deepdive.mealornomeal.model;

import com.google.gson.annotations.Expose;

/**
 * The Meal class provides the elements to be able to retrieve and send data.
 */
public class Meal {

  @Expose
  private Long id;
  @Expose
  private String name;
  @Expose
  private String instruction;
  @Expose
  private Integer prepTime;
  @Expose
  private String requirements;
//  private Long creatorId;


  /**
   * Gets id.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets instruction.
   *
   * @return the instruction
   */
  public String getInstruction() {
    return instruction;
  }

  /**
   * Sets instruction.
   *
   * @param instruction the instruction
   */
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  /**
   * Gets prep time.
   *
   * @return the prep time
   */
  public Integer getPrepTime() {
    return prepTime;
  }

  /**
   * Sets prep time.
   *
   * @param prepTime the prep time
   */
  public void setPrepTime(Integer prepTime) {
    this.prepTime = prepTime;
  }

  /**
   * Gets requirements.
   *
   * @return the requirements
   */
  public String getRequirements() {
    return requirements;
  }

  /**
   * Sets requirements.
   *
   * @param requirements the requirements
   */
  public void setRequirements(String requirements) {
    this.requirements = requirements;
  }

  //TODO determine relationship to get ingredients from a meal

}
