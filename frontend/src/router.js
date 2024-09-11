
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationAccomodationManager from "./components/listers/ReservationAccomodationCards"
import ReservationAccomodationDetail from "./components/listers/ReservationAccomodationDetail"

import AssigningstatusHousekeepingManager from "./components/listers/AssigningstatusHousekeepingCards"
import AssigningstatusHousekeepingDetail from "./components/listers/AssigningstatusHousekeepingDetail"

import RoomRoomManager from "./components/listers/RoomRoomCards"
import RoomRoomDetail from "./components/listers/RoomRoomDetail"

import CleaningstatusHousekeepingManager from "./components/listers/CleaningstatusHousekeepingCards"
import CleaningstatusHousekeepingDetail from "./components/listers/CleaningstatusHousekeepingDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reservations/accomodations',
                name: 'ReservationAccomodationManager',
                component: ReservationAccomodationManager
            },
            {
                path: '/reservations/accomodations/:id',
                name: 'ReservationAccomodationDetail',
                component: ReservationAccomodationDetail
            },

            {
                path: '/assigningstatuses/housekeepings',
                name: 'AssigningstatusHousekeepingManager',
                component: AssigningstatusHousekeepingManager
            },
            {
                path: '/assigningstatuses/housekeepings/:id',
                name: 'AssigningstatusHousekeepingDetail',
                component: AssigningstatusHousekeepingDetail
            },

            {
                path: '/rooms/rooms',
                name: 'RoomRoomManager',
                component: RoomRoomManager
            },
            {
                path: '/rooms/rooms/:id',
                name: 'RoomRoomDetail',
                component: RoomRoomDetail
            },

            {
                path: '/cleaningstatuses/housekeepings',
                name: 'CleaningstatusHousekeepingManager',
                component: CleaningstatusHousekeepingManager
            },
            {
                path: '/cleaningstatuses/housekeepings/:id',
                name: 'CleaningstatusHousekeepingDetail',
                component: CleaningstatusHousekeepingDetail
            },



    ]
})
