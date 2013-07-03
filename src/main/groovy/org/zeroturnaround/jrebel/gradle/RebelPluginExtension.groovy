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
package org.zeroturnaround.jrebel.gradle;

import org.zeroturnaround.jrebel.gradle.model.RebelClasspath;
import org.zeroturnaround.jrebel.gradle.model.RebelWar;
import org.zeroturnaround.jrebel.gradle.model.RebelWeb;

public class RebelPluginExtension {

  String packaging;

  File classesDirectory;

  File resourcesDirectory;

  String warSourceDirectory;

  String webappDirectory;

  RebelClasspath classpath;

  RebelClasspath resourcesClasspath;

  RebelWar war;

  RebelWeb web;

  String rootPath;

  File relativePath;

  String rebelXmlDirectory;

  String showGenerated;

  String addResourcesDirToRebelXml;

  String alwaysGenerate;
}
