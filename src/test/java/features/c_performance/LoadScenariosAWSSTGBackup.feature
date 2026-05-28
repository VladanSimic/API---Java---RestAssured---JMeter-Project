#Feature: Load Scenarios
#
#  @Load1.1
#  Scenario Outline: Load Scenario 1.1 - HO - Rate - "<thread>"
#
#    * I am logged in to Pure as "<user>"
#    * I have entered test data for test case "<state>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
#    * I load random user data
#    * I navigate to quotes
#    * I initiate a new quote
#    * I create a new "HO" quote
#    * I rate a quote
#
#    Examples:
#      | thread | user | state  |
#      | 1      | P201 | CA_001 |
#      | 2      | P202 | FL_001 |
#      | 3      | P203 | TX_001 |
#      | 4      | P204 | CA_001 |
#      | 5      | P205 | FL_001 |
#      | 6      | P206 | TX_001 |
#      | 7      | P207 | CA_001 |
#      | 8      | P208 | FL_001 |
#      | 9      | P209 | TX_001 |
#      | 10     | P210 | CA_001 |
#      | 11     | P211 | FL_001 |
#      | 12     | P212 | TX_001 |
#      | 13     | P213 | CA_001 |
#      | 14     | P214 | FL_001 |
#      | 15     | P215 | TX_001 |
#      | 16     | P216 | CA_001 |
#      | 17     | P217 | FL_001 |
#      | 18     | P218 | TX_001 |
#      | 19     | P219 | CA_001 |
#      | 20     | P220 | FL_001 |
#      | 21     | P221 | TX_001 |
#      | 22     | P222 | CA_001 |
#      | 23     | P223 | FL_001 |
#      | 24     | P224 | TX_001 |
#      | 25     | P225 | CA_001 |
#      | 26     | P226 | FL_001 |
#      | 27     | P227 | TX_001 |
#      | 28     | P228 | CA_001 |
#      | 29     | P229 | FL_001 |
#      | 30     | P230 | TX_001 |
#      | 31     | P231 | CA_001 |
#      | 32     | P232 | FL_001 |
#      | 33     | P233 | TX_001 |
#      | 34     | P234 | CA_001 |
#      | 35     | P235 | FL_001 |
#      | 36     | P236 | TX_001 |
#      | 37     | P237 | CA_001 |
#      | 38     | P238 | FL_001 |
#      | 39     | P239 | TX_001 |
#      | 40     | P240 | CA_001 |
#      | 41     | P241 | CA_001 |
#      | 42     | P242 | FL_001 |
#      | 43     | P243 | TX_001 |
#      | 44     | P244 | CA_001 |
#      | 45     | P245 | FL_001 |
#      | 46     | P246 | TX_001 |
#      | 47     | P247 | CA_001 |
#      | 48     | P248 | FL_001 |
#      | 49     | P249 | TX_001 |
#      | 50     | P250 | CA_001 |
#      | 51     | P251 | FL_001 |
#      | 52     | P252 | TX_001 |
#      | 53     | P253 | CA_001 |
#      | 54     | P254 | FL_001 |
#      | 55     | P255 | TX_001 |
#      | 56     | P256 | CA_001 |
#      | 57     | P257 | FL_001 |
#      | 58     | P258 | TX_001 |
#      | 59     | P259 | CA_001 |
#      | 60     | P260 | FL_001 |
#      | 61     | P261 | TX_001 |
#      | 62     | P262 | CA_001 |
#      | 63     | P263 | FL_001 |
#      | 64     | P264 | TX_001 |
#      | 65     | P265 | CA_001 |
#      | 66     | P266 | FL_001 |
#      | 67     | P267 | TX_001 |
#      | 68     | P268 | CA_001 |
#      | 69     | P269 | FL_001 |
#      | 70     | P270 | TX_001 |
#      | 71     | P271 | CA_001 |
#      | 72     | P272 | FL_001 |
#      | 73     | P273 | TX_001 |
#      | 74     | P274 | CA_001 |
#      | 75     | P275 | FL_001 |
#      | 76     | P276 | TX_001 |
#      | 77     | P277 | CA_001 |
#      | 78     | P278 | FL_001 |
#      | 79     | P279 | TX_001 |
#      | 80     | P280 | CA_001 |
#      | 81     | P281 | CA_001 |
#      | 82     | P282 | FL_001 |
#      | 83     | P283 | TX_001 |
#      | 84     | P284 | CA_001 |
#      | 85     | P285 | FL_001 |
#      | 86     | P286 | TX_001 |
#      | 87     | P287 | CA_001 |
#      | 88     | P288 | FL_001 |
#      | 89     | P289 | TX_001 |
#      | 90     | P290 | CA_001 |
#      | 91     | P291 | FL_001 |
#      | 92     | P292 | TX_001 |
#      | 93     | P293 | CA_001 |
#      | 94     | P294 | FL_001 |
#      | 95     | P295 | TX_001 |
#      | 96     | P296 | CA_001 |
#      | 97     | P297 | FL_001 |
#      | 98     | P298 | TX_001 |
#      | 99     | P299 | CA_001 |
#      | 100    | P300 | FL_001 |
#      | 101    | P301 | TX_001 |
#      | 102    | P302 | CA_001 |
#      | 103    | P303 | FL_001 |
#      | 104    | P304 | TX_001 |
#      | 105    | P305 | CA_001 |
#      | 106    | P306 | FL_001 |
#      | 107    | P307 | TX_001 |
#      | 108    | P308 | CA_001 |
#      | 109    | P309 | FL_001 |
#      | 110    | P310 | TX_001 |
#      | 111    | P311 | CA_001 |
#      | 112    | P312 | FL_001 |
#      | 113    | P313 | TX_001 |
#      | 114    | P314 | CA_001 |
#      | 115    | P315 | FL_001 |
#      | 116    | P316 | TX_001 |
#      | 117    | P317 | CA_001 |
#      | 118    | P318 | FL_001 |
#      | 119    | P319 | TX_001 |
#      | 120    | P320 | CA_001 |
#      | 121    | P321 | CA_001 |
#      | 122    | P322 | FL_001 |
#      | 123    | P323 | TX_001 |
#      | 124    | P324 | CA_001 |
#      | 125    | P325 | FL_001 |
#      | 126    | P326 | TX_001 |
#      | 127    | P327 | CA_001 |
#      | 128    | P328 | FL_001 |
#      | 129    | P329 | TX_001 |
#      | 130    | P330 | CA_001 |
#      | 131    | P331 | FL_001 |
#      | 132    | P332 | TX_001 |
#      | 133    | P333 | CA_001 |
#      | 134    | P334 | FL_001 |
#      | 135    | P335 | TX_001 |
#      | 136    | P336 | CA_001 |
#      | 137    | P337 | FL_001 |
#      | 138    | P338 | TX_001 |
#      | 139    | P339 | CA_001 |
#      | 140    | P340 | FL_001 |
#      | 141    | P341 | TX_001 |
#      | 142    | P342 | CA_001 |
#      | 143    | P343 | FL_001 |
#      | 144    | P344 | TX_001 |
#      | 145    | P345 | CA_001 |
#      | 146    | P346 | FL_001 |
#      | 147    | P347 | TX_001 |
#      | 148    | P348 | CA_001 |
#      | 149    | P349 | FL_001 |
#      | 150    | P350 | TX_001 |
#      | 151    | P351 | CA_001 |
#      | 152    | P352 | FL_001 |
#      | 153    | P353 | TX_001 |
#      | 154    | P354 | CA_001 |
#      | 155    | P355 | FL_001 |
#      | 156    | P356 | TX_001 |
#      | 157    | P357 | CA_001 |
#      | 158    | P358 | FL_001 |
#      | 159    | P359 | TX_001 |
#      | 160    | P360 | CA_001 |
#      | 161    | P361 | CA_001 |
#      | 162    | P362 | FL_001 |
#      | 163    | P363 | TX_001 |
#      | 164    | P364 | CA_001 |
#      | 165    | P365 | FL_001 |
#      | 166    | P366 | TX_001 |
#      | 167    | P367 | CA_001 |
#      | 168    | P368 | FL_001 |
#      | 169    | P369 | TX_001 |
#      | 170    | P370 | CA_001 |
#      | 171    | P371 | FL_001 |
#      | 172    | P372 | TX_001 |
#      | 173    | P373 | CA_001 |
#      | 174    | P374 | FL_001 |
#      | 175    | P375 | TX_001 |
#      | 176    | P376 | CA_001 |
#      | 177    | P377 | FL_001 |
#      | 178    | P378 | TX_001 |
#      | 179    | P379 | CA_001 |
#      | 180    | P380 | FL_001 |
#      | 181    | P381 | TX_001 |
#      | 182    | P382 | CA_001 |
#      | 183    | P383 | FL_001 |
#      | 184    | P384 | TX_001 |
#      | 185    | P385 | CA_001 |
#      | 186    | P386 | FL_001 |
#      | 187    | P387 | TX_001 |
#      | 188    | P388 | CA_001 |
#      | 189    | P389 | FL_001 |
#      | 190    | P390 | TX_001 |
#      | 191    | P391 | CA_001 |
#      | 192    | P392 | FL_001 |
#      | 193    | P393 | TX_001 |
#      | 194    | P394 | CA_001 |
#      | 195    | P395 | FL_001 |
#      | 196    | P396 | TX_001 |
#      | 197    | P397 | CA_001 |
#      | 198    | P398 | FL_001 |
#      | 199    | P399 | TX_001 |
#      | 200    | P400 | CA_001 |
#
#  @Load1.2
#  Scenario Outline: Load Scenario 1.2 - PA - Rate - "<thread>"
#
#    * I am logged in to Pure as "<user>"
#    * I have entered test data for test case "<state>" in excel workbook "QuoteCreationPA" in sheet "QuoteCreatorPA" for "PA" LOB
#    * I load random user data
#    * I navigate to quotes
#    * I initiate a new quote
#    * I create a new "PA" quote
#    * I rate a quote
#
#    Examples:
#      | thread | user | state  |
#      | 1      | P401 | CA_001 |
#      | 2      | P402 | FL_001 |
#      | 3      | P403 | TX_001 |
#      | 4      | P404 | CA_001 |
#      | 5      | P405 | FL_001 |
#      | 6      | P406 | TX_001 |
#      | 7      | P407 | CA_001 |
#      | 8      | P408 | FL_001 |
#      | 9      | P409 | TX_001 |
#      | 10     | P410 | CA_001 |
#      | 11     | P411 | FL_001 |
#      | 12     | P412 | TX_001 |
#      | 13     | P413 | CA_001 |
#      | 14     | P414 | FL_001 |
#      | 15     | P415 | TX_001 |
#      | 16     | P416 | CA_001 |
#      | 17     | P417 | FL_001 |
#      | 18     | P418 | TX_001 |
#      | 19     | P419 | CA_001 |
#      | 20     | P420 | FL_001 |
#      | 21     | P421 | TX_001 |
#      | 22     | P422 | CA_001 |
#      | 23     | P423 | FL_001 |
#      | 24     | P424 | TX_001 |
#      | 25     | P425 | CA_001 |
#      | 26     | P426 | FL_001 |
#      | 27     | P427 | TX_001 |
#      | 28     | P428 | CA_001 |
#      | 29     | P429 | FL_001 |
#      | 30     | P430 | TX_001 |
#      | 31     | P431 | CA_001 |
#      | 32     | P432 | FL_001 |
#      | 33     | P433 | TX_001 |
#      | 34     | P434 | CA_001 |
#      | 35     | P435 | FL_001 |
#      | 36     | P436 | TX_001 |
#      | 37     | P437 | CA_001 |
#      | 38     | P438 | FL_001 |
#      | 39     | P439 | TX_001 |
#      | 40     | P440 | FL_001 |
#      | 41     | P441 | CA_001 |
#      | 42     | P442 | FL_001 |
#      | 43     | P443 | TX_001 |
#      | 44     | P444 | CA_001 |
#      | 45     | P445 | FL_001 |
#      | 46     | P446 | TX_001 |
#      | 47     | P447 | CA_001 |
#      | 48     | P448 | FL_001 |
#      | 49     | P449 | TX_001 |
#      | 50     | P450 | CA_001 |
#      | 51     | P451 | FL_001 |
#      | 52     | P452 | TX_001 |
#      | 53     | P453 | CA_001 |
#      | 54     | P454 | FL_001 |
#      | 55     | P455 | TX_001 |
#      | 56     | P456 | CA_001 |
#      | 57     | P457 | FL_001 |
#      | 58     | P458 | TX_001 |
#      | 59     | P459 | CA_001 |
#      | 60     | P460 | FL_001 |
#      | 61     | P461 | TX_001 |
#      | 62     | P462 | CA_001 |
#      | 63     | P463 | FL_001 |
#      | 64     | P464 | TX_001 |
#      | 65     | P465 | CA_001 |
#      | 66     | P466 | FL_001 |
#      | 67     | P467 | TX_001 |
#      | 68     | P468 | CA_001 |
#      | 69     | P469 | FL_001 |
#      | 70     | P470 | TX_001 |
#      | 71     | P471 | CA_001 |
#      | 72     | P472 | FL_001 |
#      | 73     | P473 | TX_001 |
#      | 74     | P474 | CA_001 |
#      | 75     | P475 | FL_001 |
#      | 76     | P476 | TX_001 |
#      | 77     | P477 | CA_001 |
#      | 78     | P478 | FL_001 |
#      | 79     | P479 | TX_001 |
#      | 80     | P480 | FL_001 |
#      | 81     | P481 | CA_001 |
#      | 82     | P482 | FL_001 |
#      | 83     | P483 | TX_001 |
#      | 84     | P484 | CA_001 |
#      | 85     | P485 | FL_001 |
#      | 86     | P486 | TX_001 |
#      | 87     | P487 | CA_001 |
#      | 88     | P488 | FL_001 |
#      | 89     | P489 | TX_001 |
#      | 90     | P490 | CA_001 |
#      | 91     | P491 | FL_001 |
#      | 92     | P492 | TX_001 |
#      | 93     | P493 | CA_001 |
#      | 94     | P494 | FL_001 |
#      | 95     | P495 | TX_001 |
#      | 96     | P496 | CA_001 |
#      | 97     | P497 | FL_001 |
#      | 98     | P498 | TX_001 |
#      | 99     | P499 | CA_001 |
#      | 100    | P500 | FL_001 |
#      | 101    | P501 | TX_001 |
#      | 102    | P502 | CA_001 |
#      | 103    | P503 | FL_001 |
#      | 104    | P504 | TX_001 |
#      | 105    | P505 | CA_001 |
#      | 106    | P506 | FL_001 |
#      | 107    | P507 | TX_001 |
#      | 108    | P508 | CA_001 |
#      | 109    | P509 | FL_001 |
#      | 110    | P510 | TX_001 |
#      | 111    | P511 | CA_001 |
#      | 112    | P512 | FL_001 |
#      | 113    | P513 | TX_001 |
#      | 114    | P514 | CA_001 |
#      | 115    | P515 | FL_001 |
#      | 116    | P516 | TX_001 |
#      | 117    | P517 | CA_001 |
#      | 118    | P518 | FL_001 |
#      | 119    | P519 | TX_001 |
#      | 120    | P520 | FL_001 |
#      | 121    | P521 | CA_001 |
#      | 122    | P522 | FL_001 |
#      | 123    | P523 | TX_001 |
#      | 124    | P524 | CA_001 |
#      | 125    | P525 | FL_001 |
#      | 126    | P526 | TX_001 |
#      | 127    | P527 | CA_001 |
#      | 128    | P528 | FL_001 |
#      | 129    | P529 | TX_001 |
#      | 130    | P530 | CA_001 |
#      | 131    | P531 | FL_001 |
#      | 132    | P532 | TX_001 |
#      | 133    | P533 | CA_001 |
#      | 134    | P534 | FL_001 |
#      | 135    | P535 | TX_001 |
#      | 136    | P536 | CA_001 |
#      | 137    | P537 | FL_001 |
#      | 138    | P538 | TX_001 |
#      | 139    | P539 | CA_001 |
#      | 140    | P540 | FL_001 |
#      | 141    | P541 | TX_001 |
#      | 142    | P542 | CA_001 |
#      | 143    | P543 | FL_001 |
#      | 144    | P544 | TX_001 |
#      | 145    | P545 | CA_001 |
#      | 146    | P546 | FL_001 |
#      | 147    | P547 | TX_001 |
#      | 148    | P548 | CA_001 |
#      | 149    | P549 | FL_001 |
#      | 150    | P550 | TX_001 |
#      | 151    | P551 | CA_001 |
#      | 152    | P552 | FL_001 |
#      | 153    | P553 | TX_001 |
#      | 154    | P554 | CA_001 |
#      | 155    | P555 | FL_001 |
#      | 156    | P556 | TX_001 |
#      | 157    | P557 | CA_001 |
#      | 158    | P558 | FL_001 |
#      | 159    | P559 | TX_001 |
#      | 160    | P560 | FL_001 |
#      | 161    | P561 | CA_001 |
#      | 162    | P562 | FL_001 |
#      | 163    | P563 | TX_001 |
#      | 164    | P564 | CA_001 |
#      | 165    | P565 | FL_001 |
#      | 166    | P566 | TX_001 |
#      | 167    | P567 | CA_001 |
#      | 168    | P568 | FL_001 |
#      | 169    | P569 | TX_001 |
#      | 170    | P570 | CA_001 |
#      | 171    | P571 | FL_001 |
#      | 172    | P572 | TX_001 |
#      | 173    | P573 | CA_001 |
#      | 174    | P574 | FL_001 |
#      | 175    | P575 | TX_001 |
#      | 176    | P576 | CA_001 |
#      | 177    | P577 | FL_001 |
#      | 178    | P578 | TX_001 |
#      | 179    | P579 | CA_001 |
#      | 180    | P580 | FL_001 |
#      | 181    | P581 | TX_001 |
#      | 182    | P582 | CA_001 |
#      | 183    | P583 | FL_001 |
#      | 184    | P584 | TX_001 |
#      | 185    | P585 | CA_001 |
#      | 186    | P586 | FL_001 |
#      | 187    | P587 | TX_001 |
#      | 188    | P588 | CA_001 |
#      | 189    | P589 | FL_001 |
#      | 190    | P590 | TX_001 |
#      | 191    | P591 | CA_001 |
#      | 192    | P592 | FL_001 |
#      | 193    | P593 | TX_001 |
#      | 194    | P594 | CA_001 |
#      | 195    | P595 | FL_001 |
#      | 196    | P596 | TX_001 |
#      | 197    | P597 | CA_001 |
#      | 198    | P598 | FL_001 |
#      | 199    | P599 | TX_001 |
#      | 200    | P600 | FL_001 |
#
#  @Load1.3
#  Scenario Outline: Load Scenario 1.3 - EX - Bind - "<thread>"
#
#    * I am logged in to Pure as "<user>"
#    * I have entered test data for test case "<state>" in excel workbook "QuoteCreationEX" in sheet "QuoteCreatorEX" for "EX" LOB
#    * I load random user data
#    * I navigate to quotes
#    * I initiate a new quote
#    * I create a new "EX" quote
#    * I rate a quote
#    * I navigate to underwriting referrals page
#    * I accept underwriting referrals
#    * I bind a quote
#
#    Examples:
#      | thread | user | state  |
#      | 1      | P601 | CA_001 |
#      | 2      | P602 | FL_001 |
#      | 3      | P603 | TX_001 |
#      | 4      | P604 | CA_001 |
#      | 5      | P605 | FL_001 |
#      | 6      | P606 | TX_001 |
#      | 7      | P607 | CA_001 |
#      | 8      | P608 | FL_001 |
#      | 9      | P609 | TX_001 |
#      | 10     | P610 | CA_001 |
#      | 11     | P611 | FL_001 |
#      | 12     | P612 | TX_001 |
#      | 13     | P613 | CA_001 |
#      | 14     | P614 | FL_001 |
#      | 15     | P615 | TX_001 |
#      | 16     | P616 | CA_001 |
#      | 17     | P617 | FL_001 |
#      | 18     | P618 | TX_001 |
#      | 19     | P619 | CA_001 |
#      | 20     | P620 | FL_001 |
#      | 21     | P621 | TX_001 |
#      | 22     | P622 | CA_001 |
#      | 23     | P623 | FL_001 |
#      | 24     | P624 | TX_001 |
#      | 25     | P625 | CA_001 |
#      | 26     | P626 | FL_001 |
#      | 27     | P627 | TX_001 |
#      | 28     | P628 | CA_001 |
#      | 29     | P629 | FL_001 |
#      | 30     | P630 | TX_001 |
#      | 31     | P631 | CA_001 |
#      | 32     | P632 | FL_001 |
#      | 33     | P633 | TX_001 |
#      | 34     | P634 | CA_001 |
#      | 35     | P635 | FL_001 |
#      | 36     | P636 | TX_001 |
#      | 37     | P637 | CA_001 |
#      | 38     | P638 | FL_001 |
#      | 39     | P639 | TX_001 |
#      | 40     | P640 | CA_001 |
#      | 41     | P641 | FL_001 |
#      | 42     | P642 | TX_001 |
#      | 43     | P643 | CA_001 |
#      | 44     | P644 | FL_001 |
#      | 45     | P645 | TX_001 |
#      | 46     | P646 | CA_001 |
#      | 47     | P647 | FL_001 |
#      | 48     | P648 | TX_001 |
#      | 49     | P649 | CA_001 |
#      | 50     | P650 | FL_001 |
#
#  @Load2
#  Scenario Outline: Load Scenario 2 - Policies and Customers page - "<thread>"
#
#    * I open OKTA and select tile with "<user>"
#    * I think for 2 to 5 seconds and I keep navigating to policies and customers page 180 times
#
#    Examples:
#      | thread | user |
#      | 1      | A1   |
#      | 2      | A6   |
#      | 3      | A17  |
#      | 4      | A19  |
#
#  @Load3
#  Scenario Outline: Load Scenario 3 - Policy transactions - "<thread>"
#
#    * I am logged in to Pure as "<user>"
#    * I think for 5 to 10 seconds and i keep navigating to transactions and endorsements page for 360 times for "<policyID>"
#
#    Examples:
#      | thread | user | policyID    |
#      | 1      | P651 | EX003438910 |
#      | 2      | P652 | PW240114000 |
#      | 3      | P653 | CO240114200 |
#      | 4      | P654 | HO043199908 |
##      | 5      | P655 | CO240114200 |
##      | 6      | P656 | CO240114200 |
#      | 7      | P657 | PA004124811 |
#      | 8      | P658 | PA240114400 |
#      | 9      | P659 | HO004124610 |
##      | 10     | P660 | PA240114400 |
#      | 11     | P661 | CO004125310 |
#      | 12     | P662 | PW240114500 |
#      | 13     | P663 | HO005437412 |
#      | 14     | P664 | HS211628004 |
#      | 15     | P665 | PW240114700 |
##      | 16     | P666 | PW240114700 |
#      | 17     | P667 | EX001895710 |
#      | 18     | P668 | EX240622500 |
#      | 19     | P669 | HS233551700 |
##      | 20     | P670 | EX240622500 |
#
#  @Load4
#  Scenario Outline: Load Scenario 4 - Agent login - "<thread>"
#
#    And I think for 9 to 20 seconds and i keep logging in as "<user>" for 360 times
#
#    Examples:
#      | thread | user   |
#      | 1      | Agent1 |
#
#  @Load5
#  Scenario Outline: Load Scenario 5 - Customer summary - "<thread>"
#
#    * I am logged in to Pure as "<user>"
#    * I navigate to customers page
#    * I select customer by ID "<customerID>"
#    * I think for 4 to 10 seconds and i keep clicking customer summary tab for 600 times
#
#    Examples:
#      | thread | user | customerID     |
#      | 1      | P671 | 28098634819    |
#      | 2      | P672 | 8098634819     |
#      | 3      | P673 | 824794738219   |
#      | 4      | P674 | 322986368519   |
#      | 5      | P675 | 95685193919    |
#      | 6      | P676 | 88721039919    |
#      | 7      | P677 | 4514658447219  |
#      | 8      | P678 | 24794738219    |
#      | 9      | P679 | 90702940719    |
#      | 10     | P680 | 112661161919   |
#      | 11     | P681 | 595685193919   |
##      | 12     | P682 | 8098634819     |
#      | 13     | P683 | 22986368519    |
#      | 14     | P684 | 688721039919   |
##      | 15     | P685 | 95685193919    |
##      | 16     | P686 | 88721039919    |
##      | 17     | P687 | 990702940719   |
##      | 18     | P688 | 24794738219    |
#      | 19     | P689 | 10112661161919 |
#      | 20     | P690 | 711918328719   |
#
#  @Load6
#  Scenario Outline: Load Scenario 6 - Endorsement  - "<thread>"
#
#    * I am logged in to Pure as "<user>"
#    * I navigate to policies
#    * I select a policy by ID "<policyID>"
#    * I navigate to transactions or endorsements
#    * I select a transaction "Endorsement"
#    * I navigate to policy image page
#    * I go to "Policy/Bill Delivery" page
#    * I think for 40 to 60 seconds an I keep navigating to policy image page for 150 times
#
#    Examples:
#      | thread | user | policyID    |
#      | 1      | P691 | PW241189600 |
#      | 2      | P692 | ES241189300 |
#      | 3      | P693 | PA241186800 |
#      | 4      | P694 | HO241185500 |
#      | 5      | P695 | EX241189900 |
#      | 6      | P696 | CO241188700 |
#      | 7      | P697 | EX241187600 |
#      | 8      | P698 | PA241189200 |
#      | 9      | P699 | HO241188500 |
#      | 10     | P700 | HS241173000 |
#
#  @Load7
#  Scenario Outline: Load Scenario 7 - Quote summary - "<thread>"
#
#    * I am logged in to Pure as "<user>"
#    And I think for 5 to 6 seconds and i keep navigating to quote summary page for 900 times for "<accountID>"
#
#    Examples:
#      | thread | user | accountID      |
##      | 1      | P701 | 10112661161919 |
#      | 2      | P702 | 744194086529   |
##      | 3      | P703 | 711918328719   |
##      | 4      | P704 | 744194086529   |