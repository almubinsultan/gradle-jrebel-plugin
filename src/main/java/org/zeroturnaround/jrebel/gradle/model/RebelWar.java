/**
 *  Copyright (C) 2012 ZeroTurnaround <support@zeroturnaround.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.zeroturnaround.jrebel.gradle.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * War configuration.
 */
public class RebelWar {

  private String path;
  
  /**
   * The path value before we did the "fixPath()". Internal.
   */
  private String originalPath;

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  /**
   * (internal, for unit tests)
   */
  public String getOriginalPath() {
    return originalPath;
  }

  /**
   * (internal, for unit tests)
   */
  public void setOriginalPath(String originalPath) {
    this.originalPath = originalPath;
  }

  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.DEFAULT_STYLE);
    builder.append("path", path);
    builder.append("originalPath", path);
    return builder.toString();
  }
  
}
