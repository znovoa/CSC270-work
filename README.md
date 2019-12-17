# Émile Zola, The Ladies' Paradise

Status: In Progress

*The Ladies' Paradise*, Émile Zola. Translated without abridgment from the 50th French edition.

## Bibliography

## Using Scripts to Validate, Reproduce, and Analyze
Everything in this repository should be reproducible. It is a project using Scala code.
### Requirements
- Java JDK 1.8 or higher.
- [SBT](https://www.scala-sbt.org) installed and on the PATH.
### Running
- Clone this repository.
- Navigate to the root level.
`$ sbt console`
`scala> :load scripts/char-validate.sc`

## Code Contents

### Character Validation
The characters in this text have been validated to character-set using a [Scala script](https://github.com/znovoa/CSC270-work/blob/master/scripts/corpus-char-validate.sc). The following is a table of the characters that are in the text.

| Character | Character | Character | Character | Character |
|-----------|-----------|-----------|-----------|-----------|
| `space` (20) | `!` (21) | `&` (26) | `'` (27) | `*` (2a) |
| `,` (2c) | `-` (2d) | `.` (2e) | `0` (30) | `1` (31) |
| `2` (32) | `3` (33) | `4` (34) | `5` (35) | `6` (36) |
| `7` (37) | `8` (38) | `9` (39) | `:` (3a) | `;` (3b) |
| `?` (3f) | `A` (41) | `B` (42) | `C` (43) | `D` (44) |
| `E` (45) | `F` (46) | `G` (47) | `H` (48) | `I` (49) |
| `J` (4a) | `K` (4b) | `L` (4c) | `M` (4d) | `N` (4e) |
| `O` (4f) | `P` (50) | `Q` (51) | `R` (52) | `S` (53) |
| `T` (54) | `U` (55) | `V` (56) | `W` (57) | `X` (58) |
| `Y` (59) | `Z` (5a) | `[` (5b) | `]` (5d) | `_` (5f) |
| `a` (61) | `b` (62) | `c` (63) | `d` (64) | `e` (65) |
| `f` (66) | `g` (67) | `h` (68) | `i` (69) | `j` (6a) |
| `k` (6b) | `l` (6c) | `m` (6d) | `n` (6e) | `o` (6f) |
| `p` (70) | `q` (71) | `r` (72) | `s` (73) | `t` (74) |
| `u` (75) | `v` (76) | `w` (77) | `x` (78) | `y` (79) |
| `z` (7a) | `»` (bb) | `À` (c0) | `Î` (ce) | `à` (e0) |
| `â` (e2) | `ç` (e7) | `è` (e8) | `é` (e9) | `ê` (ea) |
| `ï` (ef) | `ô` (f4) | `ÿ` (ff) | `“` (201c) | `”` (201d) |
| `﻿` (feff) |

This can be reproduced through:

`$ sbt console
scala> :load scripts/corpus-char-validate.sc`
