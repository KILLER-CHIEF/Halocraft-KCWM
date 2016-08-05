//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelSniperRifle extends Model3DWeaponBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelSniperRifle()
	{
		gunModel = new ModelRendererTurbo[220];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 20
		gunModel[18] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 23
		gunModel[19] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 26
		gunModel[20] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 27
		gunModel[21] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 28
		gunModel[22] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 29
		gunModel[23] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 30
		gunModel[24] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 31
		gunModel[25] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 32
		gunModel[26] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 33
		gunModel[27] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 34
		gunModel[28] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 35
		gunModel[29] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 40
		gunModel[30] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 41
		gunModel[31] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 42
		gunModel[32] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 43
		gunModel[33] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 45
		gunModel[34] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 46
		gunModel[35] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 47
		gunModel[36] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 48
		gunModel[37] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 49
		gunModel[38] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 50
		gunModel[39] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 51
		gunModel[40] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 52
		gunModel[41] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 54
		gunModel[42] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 67
		gunModel[43] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 69
		gunModel[44] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 70
		gunModel[45] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 72
		gunModel[46] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 73
		gunModel[47] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 74
		gunModel[48] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 75
		gunModel[49] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 76
		gunModel[50] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 77
		gunModel[51] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 78
		gunModel[52] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 80
		gunModel[53] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 81
		gunModel[54] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 82
		gunModel[55] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 83
		gunModel[56] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 84
		gunModel[57] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 85
		gunModel[58] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 86
		gunModel[59] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 87
		gunModel[60] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 88
		gunModel[61] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 89
		gunModel[62] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 90
		gunModel[63] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 91
		gunModel[64] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 92
		gunModel[65] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 93
		gunModel[66] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 94
		gunModel[67] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 95
		gunModel[68] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 96
		gunModel[69] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 97
		gunModel[70] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 98
		gunModel[71] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 99
		gunModel[72] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 100
		gunModel[73] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 101
		gunModel[74] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 102
		gunModel[75] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 103
		gunModel[76] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 104
		gunModel[77] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 105
		gunModel[78] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 106
		gunModel[79] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 107
		gunModel[80] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 108
		gunModel[81] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 109
		gunModel[82] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 110
		gunModel[83] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 111
		gunModel[84] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 112
		gunModel[85] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 113
		gunModel[86] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 114
		gunModel[87] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 115
		gunModel[88] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 116
		gunModel[89] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 117
		gunModel[90] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 118
		gunModel[91] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 119
		gunModel[92] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 120
		gunModel[93] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 121
		gunModel[94] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 122
		gunModel[95] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 123
		gunModel[96] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 124
		gunModel[97] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 125
		gunModel[98] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 126
		gunModel[99] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 127
		gunModel[100] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 128
		gunModel[101] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 129
		gunModel[102] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 130
		gunModel[103] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 131
		gunModel[104] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 132
		gunModel[105] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 133
		gunModel[106] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 134
		gunModel[107] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 135
		gunModel[108] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Box 136
		gunModel[109] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 137
		gunModel[110] = new ModelRendererTurbo(this, 81, 297, textureX, textureY); // Box 138
		gunModel[111] = new ModelRendererTurbo(this, 225, 297, textureX, textureY); // Box 139
		gunModel[112] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 140
		gunModel[113] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 141
		gunModel[114] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 142
		gunModel[115] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 143
		gunModel[116] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 144
		gunModel[117] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 145
		gunModel[118] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 146
		gunModel[119] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 147
		gunModel[120] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 148
		gunModel[121] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 149
		gunModel[122] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 150
		gunModel[123] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 151
		gunModel[124] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 152
		gunModel[125] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 153
		gunModel[126] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 154
		gunModel[127] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 155
		gunModel[128] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 156
		gunModel[129] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 157
		gunModel[130] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 158
		gunModel[131] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 159
		gunModel[132] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 160
		gunModel[133] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 162
		gunModel[134] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 163
		gunModel[135] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 165
		gunModel[136] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 166
		gunModel[137] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 167
		gunModel[138] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 168
		gunModel[139] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 169
		gunModel[140] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 170
		gunModel[141] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 171
		gunModel[142] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 172
		gunModel[143] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 173
		gunModel[144] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 174
		gunModel[145] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 175
		gunModel[146] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 176
		gunModel[147] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 177
		gunModel[148] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 178
		gunModel[149] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 179
		gunModel[150] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 180
		gunModel[151] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 181
		gunModel[152] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 182
		gunModel[153] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 183
		gunModel[154] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 184
		gunModel[155] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 185
		gunModel[156] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 186
		gunModel[157] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 187
		gunModel[158] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 188
		gunModel[159] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 189
		gunModel[160] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 190
		gunModel[161] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 191
		gunModel[162] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 192
		gunModel[163] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 193
		gunModel[164] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 194
		gunModel[165] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 195
		gunModel[166] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 196
		gunModel[167] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 197
		gunModel[168] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 199
		gunModel[169] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 200
		gunModel[170] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 201
		gunModel[171] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 202
		gunModel[172] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 203
		gunModel[173] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 204
		gunModel[174] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 205
		gunModel[175] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 206
		gunModel[176] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 207
		gunModel[177] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 208
		gunModel[178] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 209
		gunModel[179] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 210
		gunModel[180] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 211
		gunModel[181] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 212
		gunModel[182] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 213
		gunModel[183] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 214
		gunModel[184] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 215
		gunModel[185] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 216
		gunModel[186] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 217
		gunModel[187] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 218
		gunModel[188] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 219
		gunModel[189] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 220
		gunModel[190] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 221
		gunModel[191] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 222
		gunModel[192] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 223
		gunModel[193] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 224
		gunModel[194] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 225
		gunModel[195] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 226
		gunModel[196] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 227
		gunModel[197] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 228
		gunModel[198] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 229
		gunModel[199] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 230
		gunModel[200] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 231
		gunModel[201] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 232
		gunModel[202] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 233
		gunModel[203] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 234
		gunModel[204] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 235
		gunModel[205] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 236
		gunModel[206] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 237
		gunModel[207] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 238
		gunModel[208] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 239
		gunModel[209] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 240
		gunModel[210] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 241
		gunModel[211] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 211
		gunModel[212] = new ModelRendererTurbo(this, 215, 81, textureX, textureY); // Box 212
		gunModel[213] = new ModelRendererTurbo(this, 220, 81, textureX, textureY); // Box 213
		gunModel[214] = new ModelRendererTurbo(this, 215, 85, textureX, textureY); // Box 214
		gunModel[215] = new ModelRendererTurbo(this, 220, 85, textureX, textureY); // Box 215
		gunModel[216] = new ModelRendererTurbo(this, 210, 6, textureX, textureY); // Box 218
		gunModel[217] = new ModelRendererTurbo(this, 210, 6, textureX, textureY); // Box 219
		gunModel[218] = new ModelRendererTurbo(this, 210, 6, textureX, textureY); // Box 221
		gunModel[219] = new ModelRendererTurbo(this, 210, 6, textureX, textureY); // Box 223

		gunModel[0].addShapeBox(0F, 0F, 0F, 6, 12, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 1F, 0F, -1.5F, 1F, 0F); // Box 0
		gunModel[0].setRotationPoint(1F, 0F, -52F);

		gunModel[1].addBox(0F, 0F, 0F, 6, 4, 62, 0F); // Box 1
		gunModel[1].setRotationPoint(1F, -4F, -52F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(1F, -6F, -52F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 26, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(1F, -6F, -46F);

		gunModel[4].addBox(0F, 0F, 0F, 6, 2, 49, 0F); // Box 5
		gunModel[4].setRotationPoint(1F, -6F, -20F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 49, 0F,-1F, 0F, -1F, 0F, 1F, -2F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[5].setRotationPoint(1F, -8F, -20F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 49, 0F,0F, 1F, -2F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[6].setRotationPoint(5F, -8F, -20F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 49, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[7].setRotationPoint(3F, -9F, -20F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 15, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 9
		gunModel[8].setRotationPoint(2F, 11F, -21F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[9].setRotationPoint(2F, 0F, -5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 11
		gunModel[10].setRotationPoint(2F, 2F, -4F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 4, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 1F, -2F, -0.5F, 1F, -2F); // Box 12
		gunModel[11].setRotationPoint(2F, 4F, -4F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 6, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 13
		gunModel[12].setRotationPoint(1F, -4F, 10F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 6, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[13].setRotationPoint(1F, -4F, 28F);

		gunModel[14].addBox(0F, 0F, 0F, 8, 4, 18, 0F); // Box 15
		gunModel[14].setRotationPoint(0F, 0F, 10F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 8, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 16
		gunModel[15].setRotationPoint(0F, 0F, 28F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[16].setRotationPoint(3F, -9F, 31F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[17].setRotationPoint(5F, -9F, 31F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,-0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[18].setRotationPoint(1F, -9F, 31F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[19].setRotationPoint(4F, -9F, 31F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[20].setRotationPoint(3F, -5F, 31F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 28
		gunModel[21].setRotationPoint(4F, -5F, 31F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[22].setRotationPoint(5F, -7F, 31F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[23].setRotationPoint(5F, -6F, 31F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[24].setRotationPoint(1F, -6F, 31F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 32
		gunModel[25].setRotationPoint(1F, -7F, 31F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[26].setRotationPoint(5F, -5F, 31F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F); // Box 34
		gunModel[27].setRotationPoint(1F, -5F, 31F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[28].setRotationPoint(5F, -6F, 49F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[29].setRotationPoint(5F, -7F, 49F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[30].setRotationPoint(4F, -9F, 49F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -0.7F, -0.7F, 0F, -1.4F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[31].setRotationPoint(5F, -9F, 49F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[32].setRotationPoint(3F, -9F, 49F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 45
		gunModel[33].setRotationPoint(1F, -7F, 49F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 46
		gunModel[34].setRotationPoint(1F, -6F, 49F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.4F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 47
		gunModel[35].setRotationPoint(1F, -9F, 49F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F, -1.4F, -1.4F, 0F, 0F, -1F, 0F); // Box 48
		gunModel[36].setRotationPoint(5F, -5F, 49F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.4F, -1.4F, 0F); // Box 49
		gunModel[37].setRotationPoint(1F, -5F, 49F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F); // Box 50
		gunModel[38].setRotationPoint(3F, -5F, 49F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F); // Box 51
		gunModel[39].setRotationPoint(4F, -5F, 49F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[40].setRotationPoint(4F, -8F, 52F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[41].setRotationPoint(5F, -8F, 52F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[42].setRotationPoint(3F, -8F, 52F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F); // Box 69
		gunModel[43].setRotationPoint(3F, -5F, 52F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F); // Box 70
		gunModel[44].setRotationPoint(4F, -5F, 52F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[45].setRotationPoint(5F, -7F, 52F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[46].setRotationPoint(5F, -6F, 52F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 74
		gunModel[47].setRotationPoint(2F, -8F, 52F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 75
		gunModel[48].setRotationPoint(2F, -6F, 52F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 76
		gunModel[49].setRotationPoint(2F, -7F, 52F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F); // Box 77
		gunModel[50].setRotationPoint(2F, -5F, 52F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F); // Box 78
		gunModel[51].setRotationPoint(5F, -5F, 52F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		gunModel[52].setRotationPoint(4F, -8F, 54F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[53].setRotationPoint(5F, -8F, 54F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[54].setRotationPoint(5F, -7F, 54F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[55].setRotationPoint(3F, -8F, 54F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,-0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 84
		gunModel[56].setRotationPoint(2F, -8F, 54F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 85
		gunModel[57].setRotationPoint(2F, -7F, 54F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 86
		gunModel[58].setRotationPoint(2F, -6F, 54F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 87
		gunModel[59].setRotationPoint(5F, -6F, 54F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F); // Box 88
		gunModel[60].setRotationPoint(5F, -5F, 54F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F); // Box 89
		gunModel[61].setRotationPoint(2F, -5F, 54F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F); // Box 90
		gunModel[62].setRotationPoint(4F, -5F, 54F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F); // Box 91
		gunModel[63].setRotationPoint(3F, -5F, 54F);

		gunModel[64].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 92
		gunModel[64].setRotationPoint(2F, -8F, 123F);

		gunModel[65].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 93
		gunModel[65].setRotationPoint(2F, -5F, 123F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 94
		gunModel[66].setRotationPoint(0F, -8F, 123F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[67].setRotationPoint(0F, -8F, 124F);

		gunModel[68].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 96
		gunModel[68].setRotationPoint(2F, -8F, 124F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 97
		gunModel[69].setRotationPoint(0F, -5F, 124F);

		gunModel[70].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 98
		gunModel[70].setRotationPoint(2F, -5F, 124F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[71].setRotationPoint(6F, -8F, 123F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[72].setRotationPoint(6F, -8F, 124F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[73].setRotationPoint(6F, -5F, 124F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F); // Box 102
		gunModel[74].setRotationPoint(0F, -8F, 130F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0F); // Box 103
		gunModel[75].setRotationPoint(6F, -8F, 130F);

		gunModel[76].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 104
		gunModel[76].setRotationPoint(2F, -8F, 130F);

		gunModel[77].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 105
		gunModel[77].setRotationPoint(2F, -5F, 130F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 106
		gunModel[78].setRotationPoint(6F, -7F, 127F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 107
		gunModel[79].setRotationPoint(0F, -7F, 127F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[80].setRotationPoint(4F, -8F, 132F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		gunModel[81].setRotationPoint(3F, -8F, 132F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 110
		gunModel[82].setRotationPoint(2F, -8F, 132F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 111
		gunModel[83].setRotationPoint(2F, -7F, 132F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 112
		gunModel[84].setRotationPoint(2F, -6F, 132F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F); // Box 113
		gunModel[85].setRotationPoint(2F, -5F, 132F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F); // Box 114
		gunModel[86].setRotationPoint(3F, -5F, 132F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F); // Box 115
		gunModel[87].setRotationPoint(4F, -5F, 132F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F); // Box 116
		gunModel[88].setRotationPoint(5F, -5F, 132F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 117
		gunModel[89].setRotationPoint(5F, -6F, 132F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 118
		gunModel[90].setRotationPoint(5F, -7F, 132F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 119
		gunModel[91].setRotationPoint(5F, -8F, 132F);

		gunModel[92].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 120
		gunModel[92].setRotationPoint(5F, -7F, 130F);

		gunModel[93].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 121
		gunModel[93].setRotationPoint(2F, -7F, 130F);

		gunModel[94].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 122
		gunModel[94].setRotationPoint(2F, -7F, 123F);

		gunModel[95].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 123
		gunModel[95].setRotationPoint(5F, -7F, 123F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F); // Box 124
		gunModel[96].setRotationPoint(4F, -7F, 132F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 125
		gunModel[97].setRotationPoint(4F, -6F, 132F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 126
		gunModel[98].setRotationPoint(3F, -6F, 132F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F); // Box 127
		gunModel[99].setRotationPoint(3F, -7F, 132F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		gunModel[100].setRotationPoint(5F, -7F, 126.7F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 129
		gunModel[101].setRotationPoint(5F, -6F, 126.7F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 130
		gunModel[102].setRotationPoint(4F, -6F, 126.7F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F); // Box 131
		gunModel[103].setRotationPoint(4F, -7F, 126.7F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 132
		gunModel[104].setRotationPoint(2F, -7F, 126.7F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F); // Box 133
		gunModel[105].setRotationPoint(3F, -7F, 126.7F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 134
		gunModel[106].setRotationPoint(3F, -6F, 126.7F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 135
		gunModel[107].setRotationPoint(2F, -6F, 126.7F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,-0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 136
		gunModel[108].setRotationPoint(4F, -6F, 54F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 137
		gunModel[109].setRotationPoint(3F, -6F, 54F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F); // Box 138
		gunModel[110].setRotationPoint(3F, -7F, 54F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 70, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.7F, 0F); // Box 139
		gunModel[111].setRotationPoint(4F, -7F, 54F);

		gunModel[112].addBox(0F, 0F, 0F, 4, 6, 18, 0F); // Box 140
		gunModel[112].setRotationPoint(2F, 4F, 10F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 4, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 141
		gunModel[113].setRotationPoint(2F, 10F, 10F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		gunModel[114].setRotationPoint(2F, 12F, 10F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		gunModel[115].setRotationPoint(0F, 0F, 9F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		gunModel[116].setRotationPoint(0F, -4F, 9F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		gunModel[117].setRotationPoint(7F, -4F, 9F);

		gunModel[118].addBox(0F, 0F, 0F, 1, 1, 22, 0F); // Box 146
		gunModel[118].setRotationPoint(7F, -4F, 44F);
		gunModel[118].rotateAngleX = -0.57595865F;
		gunModel[118].rotateAngleZ = 0.45378561F;

		gunModel[119].addShapeBox(0F, 0F, 22F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 147
		gunModel[119].setRotationPoint(7F, -4F, 44F);
		gunModel[119].rotateAngleX = -0.57595865F;
		gunModel[119].rotateAngleZ = 0.45378561F;

		gunModel[120].addShapeBox(-1F, -2F, 26F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 148
		gunModel[120].setRotationPoint(7F, -4F, 44F);
		gunModel[120].rotateAngleX = -0.57595865F;
		gunModel[120].rotateAngleZ = 0.45378561F;

		gunModel[121].addShapeBox(-1F, -1F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		gunModel[121].setRotationPoint(7F, -4F, 44F);
		gunModel[121].rotateAngleX = -0.57595865F;
		gunModel[121].rotateAngleZ = 0.45378561F;

		gunModel[122].addShapeBox(-1F, 1F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 150
		gunModel[122].setRotationPoint(7F, -4F, 44F);
		gunModel[122].rotateAngleX = -0.57595865F;
		gunModel[122].rotateAngleZ = 0.45378561F;

		gunModel[123].addBox(-1F, 0F, 0F, 1, 1, 4, 0F); // Box 151
		gunModel[123].setRotationPoint(7F, -4F, 44F);
		gunModel[123].rotateAngleX = -0.57595865F;
		gunModel[123].rotateAngleZ = 0.45378561F;

		gunModel[124].addShapeBox(-1F, -1F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		gunModel[124].setRotationPoint(1F, -4F, 44F);
		gunModel[124].rotateAngleX = -0.57595865F;
		gunModel[124].rotateAngleZ = -0.45378561F;

		gunModel[125].addShapeBox(-1F, 1F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 153
		gunModel[125].setRotationPoint(1F, -4F, 44F);
		gunModel[125].rotateAngleX = -0.57595865F;
		gunModel[125].rotateAngleZ = -0.45378561F;

		gunModel[126].addBox(-1F, 0F, 0F, 1, 1, 22, 0F); // Box 154
		gunModel[126].setRotationPoint(1F, -4F, 44F);
		gunModel[126].rotateAngleX = -0.57595865F;
		gunModel[126].rotateAngleZ = -0.45378561F;

		gunModel[127].addShapeBox(-1F, 0F, 22F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 155
		gunModel[127].setRotationPoint(1F, -4F, 44F);
		gunModel[127].rotateAngleX = -0.57595865F;
		gunModel[127].rotateAngleZ = -0.45378561F;

		gunModel[128].addShapeBox(-2F, -2F, 26F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 156
		gunModel[128].setRotationPoint(1F, -4F, 44F);
		gunModel[128].rotateAngleX = -0.57595865F;
		gunModel[128].rotateAngleZ = -0.45378561F;

		gunModel[129].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 157
		gunModel[129].setRotationPoint(1F, -4F, 44F);
		gunModel[129].rotateAngleX = -0.57595865F;
		gunModel[129].rotateAngleZ = -0.45378561F;

		gunModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 158
		gunModel[130].setRotationPoint(3F, 0F, 49F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 24, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		gunModel[131].setRotationPoint(3F, -1F, 49F);

		gunModel[132].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 160
		gunModel[132].setRotationPoint(-1F, -16F, 44F);

		gunModel[133].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 162
		gunModel[133].setRotationPoint(0F, -17F, 44F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		gunModel[134].setRotationPoint(-1F, -17F, 44F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		gunModel[135].setRotationPoint(8F, -17F, 44F);

		gunModel[136].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 166
		gunModel[136].setRotationPoint(8F, -16F, 44F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F); // Box 167
		gunModel[137].setRotationPoint(8F, -6F, 44F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F); // Box 168
		gunModel[138].setRotationPoint(-1F, -6F, 44F);

		gunModel[139].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 169
		gunModel[139].setRotationPoint(0F, -6F, 44F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 170
		gunModel[140].setRotationPoint(0F, -2F, 43F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, 0F, -1.4F, -1.4F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		gunModel[141].setRotationPoint(5F, -9F, 29F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		gunModel[142].setRotationPoint(4F, -9F, 29F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		gunModel[143].setRotationPoint(5F, -6F, 29F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 174
		gunModel[144].setRotationPoint(5F, -7F, 29F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.4F, -1.4F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F); // Box 175
		gunModel[145].setRotationPoint(5F, -5F, 29F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 176
		gunModel[146].setRotationPoint(4F, -5F, 29F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 177
		gunModel[147].setRotationPoint(3F, -5F, 29F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F); // Box 178
		gunModel[148].setRotationPoint(1F, -5F, 29F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		gunModel[149].setRotationPoint(1F, -6F, 29F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 180
		gunModel[150].setRotationPoint(1F, -7F, 29F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.4F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		gunModel[151].setRotationPoint(1F, -9F, 29F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		gunModel[152].setRotationPoint(3F, -9F, 29F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 183
		gunModel[153].setRotationPoint(3F, -11F, 9F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 9, 5, 12, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		gunModel[154].setRotationPoint(1F, -15F, 9F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 185
		gunModel[155].setRotationPoint(0F, -15F, 9F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		gunModel[156].setRotationPoint(-1F, -15F, 9F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 187
		gunModel[157].setRotationPoint(-1F, -12.5F, 9F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		gunModel[158].setRotationPoint(-1F, -13.5F, 9F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 1, 5, 15, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 189
		gunModel[159].setRotationPoint(10F, -15F, 9F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 0F); // Box 190
		gunModel[160].setRotationPoint(11F, -12.5F, 9F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 191
		gunModel[161].setRotationPoint(11F, -15F, 9F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 192
		gunModel[162].setRotationPoint(11F, -13.5F, 9F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		gunModel[163].setRotationPoint(1F, -15F, 8F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 194
		gunModel[164].setRotationPoint(1F, -11.5F, 8F);

		gunModel[165].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 195
		gunModel[165].setRotationPoint(1F, -14.5F, 8F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 196
		gunModel[166].setRotationPoint(0F, -15F, 8F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		gunModel[167].setRotationPoint(-1F, -15F, 8F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 199
		gunModel[168].setRotationPoint(-1F, -12.5F, 8F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		gunModel[169].setRotationPoint(-1F, -13.5F, 8F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 201
		gunModel[170].setRotationPoint(11F, -12.5F, 8F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		gunModel[171].setRotationPoint(11F, -15F, 8F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		gunModel[172].setRotationPoint(11F, -13.5F, 8F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 204
		gunModel[173].setRotationPoint(10F, -15F, 8F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 205
		gunModel[174].setRotationPoint(1F, -15F, 6F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F); // Box 206
		gunModel[175].setRotationPoint(10F, -15F, 6F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -1.1F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, -1.1F, 0.5F, 0F); // Box 207
		gunModel[176].setRotationPoint(10F, -14.5F, 6F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.1F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, -1.1F, 0.5F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 208
		gunModel[177].setRotationPoint(10F, -12F, 6F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.1F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, -1.1F, -0.5F, 0F); // Box 209
		gunModel[178].setRotationPoint(10F, -13F, 6F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		gunModel[179].setRotationPoint(5F, -15F, 21F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		gunModel[180].setRotationPoint(3F, -16F, 23F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		gunModel[181].setRotationPoint(-1F, -16F, 23F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		gunModel[182].setRotationPoint(2F, -16F, 23F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		gunModel[183].setRotationPoint(1F, -16F, 23F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 215
		gunModel[184].setRotationPoint(3F, -14F, 23F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F); // Box 216
		gunModel[185].setRotationPoint(3F, -12F, 23F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		gunModel[186].setRotationPoint(3F, -13F, 23F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 218
		gunModel[187].setRotationPoint(2F, -12F, 23F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 219
		gunModel[188].setRotationPoint(1F, -12F, 23F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F); // Box 220
		gunModel[189].setRotationPoint(-1F, -12F, 23F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 221
		gunModel[190].setRotationPoint(-1F, -14F, 23F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		gunModel[191].setRotationPoint(-1F, -13F, 23F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.4F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		gunModel[192].setRotationPoint(-1F, -16F, 21F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 224
		gunModel[193].setRotationPoint(-1F, -14F, 21F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F); // Box 225
		gunModel[194].setRotationPoint(-1F, -12F, 21F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		gunModel[195].setRotationPoint(-1F, -13F, 21F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 227
		gunModel[196].setRotationPoint(1F, -12F, 21F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 228
		gunModel[197].setRotationPoint(2F, -12F, 21F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.4F, -1.4F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F); // Box 229
		gunModel[198].setRotationPoint(3F, -12F, 21F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		gunModel[199].setRotationPoint(3F, -13F, 21F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, 0F, -1.4F, -1.4F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		gunModel[200].setRotationPoint(3F, -16F, 21F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 232
		gunModel[201].setRotationPoint(3F, -14F, 21F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		gunModel[202].setRotationPoint(1F, -16F, 21F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		gunModel[203].setRotationPoint(2F, -16F, 21F);

		gunModel[204].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 235
		gunModel[204].setRotationPoint(1F, -14F, 23F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		gunModel[205].setRotationPoint(0F, -6F, 43F);

		gunModel[206].addBox(0F, 0F, 0F, 8, 2, 4, 0F); // Box 237
		gunModel[206].setRotationPoint(0F, -4F, 43F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 238
		gunModel[207].setRotationPoint(3F, 3F, 45F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 239
		gunModel[208].setRotationPoint(3F, 8F, 30F);

		gunModel[209].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 240
		gunModel[209].setRotationPoint(3F, 7F, 30F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 144, 64, 0, 0F,0F, 0F, 0F, -135F, 0F, 0F, -135F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, -135F, -60F, 0F, -135F, -60F, 0F, 0F, -60F, 0F); // Box 241
		gunModel[210].setRotationPoint(1F, -14.6F, 7.9F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F); // Box 211
		gunModel[211].setRotationPoint(0F, -15F, 6F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		gunModel[212].setRotationPoint(2F, -16.5F, 12F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		gunModel[213].setRotationPoint(3F, -16.5F, 12F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, 0F); // Box 214
		gunModel[214].setRotationPoint(3F, -16.5F, 13F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F); // Box 215
		gunModel[215].setRotationPoint(2F, -16.5F, 13F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 218
		gunModel[216].setRotationPoint(-0.5F, -6.5F, 19F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		gunModel[217].setRotationPoint(-0.5F, -6.5F, 18F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 221
		gunModel[218].setRotationPoint(-0.5F, -5.5F, 18F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -0.3F, -0.3F); // Box 223
		gunModel[219].setRotationPoint(-0.5F, -5.5F, 19F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(gunModel);
	}
}