/*
 *     Charlatano: Free and open-source (FOSS) cheat for CS:GO/CS:CO
 *     Copyright (C) 2017 - Thomas G. P. Nappo, Jonathan Beaudoin
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

///////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////// --- GENERAL --- ///////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

/**
 * The key code of the force aim button.
 *
 * By default, this uses the backward mouse button
 * (button 5, the button on the bottom left of gaming mice).
 */
val FORCE_AIM_KEY = 5

/**
 * The field of view of the aimbot, in degrees (0 to 360).
 */
val AIM_FOV = 190

/**
 * The aimbot's "playback" speed, the higher the value the slower the playback.
 *
 * The minimum value is 1, and max must always be greater than min.
 */
val AIM_SPEED_MIN = 34
val AIM_SPEED_MAX = 42

/**
 * The strictness, or "stickiness" of the aimbot; the higher the number, the
 * less strict the aimbot will stick to targets.
 *
 * The minimum value is 1.0
 */
val AIM_STRICTNESS = 2.8



///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////// --- PERFECT AIM --- /////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

/**
 * Whether or not to use perfect aim, which will instantaneously snap
 * to the aim bone once you are within the [PERFECT_AIM_FOV].
 */
val PERFECT_AIM = true

/**
 * The FOV, in degrees (0 to 360) to snap for perfect aim.
 */
val PERFECT_AIM_FOV = 27

/**
 * The chance, from 1% to 100% (0 to 100) for perfect aim to activate.
 */
val PERFECT_AIM_CHANCE = 100



///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////// --- AIM ASSIST --- //////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

/**
 * Enables "aim assist" mode, which has no stickiness, and gives you small
 * extra movements towards the aim bone.
 *
 * This setting should be used by high-level players who are experienced aimers.
 */
val AIM_ASSIST_MODE = false

/**
 * The amount of strictness for the aim assist mode, with a mimimum value of 1.
 */
val AIM_ASSIST_STRICTNESS = 40



///////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////// --- MISCELLANEOUS --- ////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

/**
 * The duration in milliseconds at which aimbot paths are recalculated.
 */
val AIM_DURATION = 1

/**
 * The amount of sprayed shots until the aimbot shifts to aiming at the [SHOULDER_BONE].
 */
val SHIFT_TO_SHOULDER_SHOTS = 4

/**
 * The amount of sprayed shots until the aimbot shifts to aiming at the [BODY_BONE].
 */
val SHIFT_TO_BODY_SHOTS = 7